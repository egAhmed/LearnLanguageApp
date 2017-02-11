package cz.ejstn.learnlanguageapp.fragmenty;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.adaptery.SlovickaArrayAdapter;
import cz.ejstn.learnlanguageapp.model.Slovicko;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie10Doprava;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie1Zvirata;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie2Rodina;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie3JidloAPiti;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie4Cisla;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie5Barvy;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie6VolnyCas;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie7Sport;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie8Priroda;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie9Osobnost;

/**
 * A simple {@link Fragment} subclass.
 */
public class KategorieUniverzalniFragment extends Fragment {

    private String jmenoKategorie;

    private AudioManager am;

    private MediaPlayer prehravac;

    private ImageView playIkonka;

    private AudioManager.OnAudioFocusChangeListener listenerZmenaAudioFocusu = new AudioManager.OnAudioFocusChangeListener() {
        @Override
        public void onAudioFocusChange(int focusChange) {
            switch (focusChange) {
                case AudioManager.AUDIOFOCUS_GAIN:
                    Log.i("am", "AUDIOFOCUS_GAIN");
                    prehravac.start();
                    break;

                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT:
                case AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK:
                    Log.i("am", "AUDIOFOCUS_LOSS_TRANSIENT nebo TRANSIENT_CAN_DUCK");
                    prehravac.pause();
                    prehravac.seekTo(0);
                    break;

                case AudioManager.AUDIOFOCUS_LOSS:
                    Log.i("am", "AUDIOFOCUS_LOSS - permanentně ztracen");
                    releasniPrehravac();
                    break;
            }
        }
    };

    private MediaPlayer.OnCompletionListener listenerKonecZvuku = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releasniPrehravac();
        }
    };


    public KategorieUniverzalniFragment() {
        // Required empty public constructor - nelze měnit
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // vyzvednu argumenty z bundle - připojeno ve FragmentAdapteru
        jmenoKategorie = getArguments().getString("jmenoKategorie");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.kategorie, container, false);


        am = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        vsechnoPriprav(rootView);

        return rootView;

    }


    @Override
    public void onPause() {
        super.onPause();

        releasniPrehravac();
    }

    @Override
    public void onStop() {
        super.onStop();

        releasniPrehravac();
    }


    private void vsechnoPriprav(View rootView) {

        final ArrayList<Slovicko> slovicka = pripravSpravnySlovicka();


        SlovickaArrayAdapter adapter = new SlovickaArrayAdapter(getActivity(), slovicka);
        final ListView listViewSlovicek = (ListView) rootView.findViewById(R.id.listView_kategorie);
        listViewSlovicek.setAdapter(adapter);


        listViewSlovicek.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                releasniPrehravac();


                int vysledekAudioRequestu = am.requestAudioFocus
                        (listenerZmenaAudioFocusu, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (vysledekAudioRequestu == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {

                    Log.i("am", "AUDIOFOCUS GRANTED");

                    prehravac = MediaPlayer.create(getActivity(), slovicka.get(position).getIdZvuku());

                    prehravac.start();

                    prehravac.setOnCompletionListener(listenerKonecZvuku);

                    playIkonka = (ImageView) view.findViewById(R.id.play_ikonka);
                    playIkonka.setImageResource(R.drawable.ic_pause_white_36dp);

                    Thread vlakno = new Thread() {
                        @Override
                        public void run() {
                            synchronized (this) {
                                try {
                                    wait(prehravac.getDuration());

                                    getActivity().runOnUiThread(new Runnable() {
                                        @Override
                                        public void run() {
                                            ImageView playIkona = (ImageView) view.findViewById(R.id.play_ikonka);
                                            playIkona.setImageResource(R.drawable.ic_play_arrow_white_36dp);

                                        }
                                    });
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                    };

                    vlakno.start();

                }

            }
        });


    }

    private ArrayList<Slovicko> pripravSpravnySlovicka() {
        ArrayList<Slovicko> spravnySlovicka = null;

        switch (jmenoKategorie) {
            case "Zvirata":
                spravnySlovicka = Kategorie1Zvirata.pripravKategorii();
                Collections.shuffle(spravnySlovicka);
                break;

            case "Rodina":
                spravnySlovicka = Kategorie2Rodina.pripravKategorii();
                // Collections.shuffle(spravnySlovicka);
                break;

            case "JidloAPiti":
                spravnySlovicka = Kategorie3JidloAPiti.pripravKategorii();
                Collections.shuffle(spravnySlovicka);
                break;

            case "OsobnostANalada":
                spravnySlovicka = Kategorie9Osobnost.pripravKategorii();
                Collections.shuffle(spravnySlovicka);
                break;

            case "Barvy":
                spravnySlovicka = Kategorie5Barvy.pripravKategorii();
                Collections.shuffle(spravnySlovicka);
                break;

            case "VolnyCas":
                spravnySlovicka = Kategorie6VolnyCas.pripravKategorii();
                Collections.shuffle(spravnySlovicka);
                break;

            case "Sport":
                spravnySlovicka = Kategorie7Sport.pripravKategorii();
                Collections.shuffle(spravnySlovicka);
                break;

            case "PrirodaAPocasi":
                spravnySlovicka = Kategorie8Priroda.pripravKategorii();
                Collections.shuffle(spravnySlovicka);
                break;

            case "Cisla":
                spravnySlovicka = Kategorie4Cisla.pripravKategorii();
                //Collections.shuffle(spravnySlovicka);
                break;

            case "Doprava":
                spravnySlovicka = Kategorie10Doprava.pripravKategorii();
                Collections.shuffle(spravnySlovicka);
                break;
        }
        return spravnySlovicka;
    }


    private void releasniPrehravac() {
        if (prehravac != null) {
            prehravac.release();
            prehravac = null;

            am.abandonAudioFocus(listenerZmenaAudioFocusu);
            Log.i("am", "AUDIOFOCUS_ABANDONED");
        }
    }

}
