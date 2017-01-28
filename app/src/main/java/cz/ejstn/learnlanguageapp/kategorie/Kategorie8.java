package cz.ejstn.learnlanguageapp.kategorie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.adapter.SlovickaAdapter;
import cz.ejstn.learnlanguageapp.model.Slovicko;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie8Slovicka;

public class Kategorie8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategorie);

        vsechnoPriprav();





    }

    private void vsechnoPriprav() {

        ArrayList<Slovicko> slovicka = Kategorie8Slovicka.pripravKategorii();
        SlovickaAdapter adapter = new SlovickaAdapter(this, slovicka, R.color.category_item_8);

        ListView listSlovicek = (ListView) findViewById(R.id.listView_kategorie);
        listSlovicek.setAdapter(adapter);


    }
}

