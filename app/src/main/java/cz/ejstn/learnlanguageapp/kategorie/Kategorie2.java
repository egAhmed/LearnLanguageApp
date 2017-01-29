package cz.ejstn.learnlanguageapp.kategorie;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.adapter.SlovickaAdapter;
import cz.ejstn.learnlanguageapp.model.Slovicko;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie2Rodina;

public class Kategorie2 extends AppCompatActivity {

    private MediaPlayer prehravac;
    private MediaPlayer.OnCompletionListener listenerKonecZvuku = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releasniPrehravac();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie);
        vsechnoPriprav();


    }

    @Override
    protected void onPause() {
        super.onPause();
        releasniPrehravac();

    }

    @Override
    protected void onStop() {
        super.onStop();
        releasniPrehravac();
    }

    private void vsechnoPriprav() {

        final ArrayList<Slovicko> slovicka = Kategorie2Rodina.pripravKategorii();
        SlovickaAdapter adapter = new SlovickaAdapter(this, slovicka, R.color.category_item_2);

        ListView listSlovicek = (ListView) findViewById(R.id.listView_kategorie);
        listSlovicek.setAdapter(adapter);


        listSlovicek.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                releasniPrehravac();


                prehravac = MediaPlayer.create(Kategorie2.this, slovicka.get(position).getIdZvuku());
                prehravac.start();

                prehravac.setOnCompletionListener(listenerKonecZvuku);
            }
        });

    }

    private void releasniPrehravac () {
        if (prehravac != null) {
            prehravac.release();
            prehravac = null;
        }
    }
}