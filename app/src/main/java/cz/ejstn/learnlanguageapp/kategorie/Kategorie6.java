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
import cz.ejstn.learnlanguageapp.slovicka.Kategorie6Slovicka;
import cz.ejstn.learnlanguageapp.model.Slovicko;

public class Kategorie6 extends AppCompatActivity {

    private MediaPlayer prehravac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie);

        vsechnoPriprav();





    }

    private void vsechnoPriprav() {

        final ArrayList<Slovicko> slovicka = Kategorie6Slovicka.pripravKategorii();
        SlovickaAdapter adapter = new SlovickaAdapter(this, slovicka, R.color.category_item_6);

        ListView listSlovicek = (ListView) findViewById(R.id.listView_kategorie);
        listSlovicek.setAdapter(adapter);


        listSlovicek.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                prehravac = MediaPlayer.create(Kategorie6.this, slovicka.get(position).getIdZvuku());
                prehravac.start();
            }
        });

    }
}
