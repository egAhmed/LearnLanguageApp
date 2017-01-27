package cz.ejstn.learnlanguageapp.start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.kategorie.CtvrtaKategorie;
import cz.ejstn.learnlanguageapp.kategorie.DruhaKategorie;
import cz.ejstn.learnlanguageapp.kategorie.PataKategorie;
import cz.ejstn.learnlanguageapp.kategorie.PrvniKategorie;
import cz.ejstn.learnlanguageapp.kategorie.SestaKategorie;
import cz.ejstn.learnlanguageapp.kategorie.TretiKategorie;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        pripravMenu();
    }

    private void pripravMenu() {
        TextView prvniKategorie = (TextView) findViewById(R.id.menu_category_1);
        TextView druhaKategorie = (TextView) findViewById(R.id.menu_category_2);
        TextView tretiKategorie = (TextView) findViewById(R.id.menu_category_3);
        TextView ctvrtaKategorie = (TextView) findViewById(R.id.menu_category_4);
        TextView pataKategorie = (TextView) findViewById(R.id.menu_category_5);
        TextView sestaKategorie = (TextView) findViewById(R.id.menu_category_6);

        prvniKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), PrvniKategorie.class);
                startActivity(i);
            }
        });

        druhaKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), DruhaKategorie.class);
                startActivity(i);
            }
        });

        tretiKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), TretiKategorie.class);
                startActivity(i);
            }
        });

        ctvrtaKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), CtvrtaKategorie.class);
                startActivity(i);
            }
        });

        pataKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), PataKategorie.class);
                startActivity(i);
            }
        });

        sestaKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), SestaKategorie.class);
                startActivity(i);
            }
        });



    }
}
