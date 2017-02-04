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
import android.widget.ListView;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.adaptery.SlovickaArrayAdapter;
import cz.ejstn.learnlanguageapp.model.Slovicko;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie2Rodina;

/**
 * A simple {@link Fragment} subclass.
 */
public class Kategorie2Fragment extends Fragment {

    private AudioManager am;

    private MediaPlayer prehravac;
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


    public Kategorie2Fragment() {
        // Required empty public constructor
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

        final ArrayList<Slovicko> slovicka = Kategorie2Rodina.pripravKategorii();
        // Collections.shuffle(slovicka);


        SlovickaArrayAdapter adapter = new SlovickaArrayAdapter(getActivity(), slovicka, R.color.model_radek_pozadi_textu);
        final ListView listSlovicek = (ListView) rootView.findViewById(R.id.listView_kategorie);
        listSlovicek.setAdapter(adapter);


        listSlovicek.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releasniPrehravac();


                int vysledekAudioRequestu = am.requestAudioFocus
                        (listenerZmenaAudioFocusu, AudioManager.STREAM_MUSIC, AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

                if (vysledekAudioRequestu == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {

                    Log.i("am", "AUDIOFOCUS GRANTED");

                    prehravac = MediaPlayer.create(getActivity(), slovicka.get(position).getIdZvuku());

                    prehravac.start();

                    prehravac.setOnCompletionListener(listenerKonecZvuku);

                }

            }
        });


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
