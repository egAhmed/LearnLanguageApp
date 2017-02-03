package cz.ejstn.learnlanguageapp.start;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie1;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie10;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie2;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie3;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie4;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie5;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie6;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie7;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie8;
import cz.ejstn.learnlanguageapp.kategorie.Kategorie9;

public class MainActivity extends AppCompatActivity {

    // TODO: 3.2.2017 přidat vnuka a vnučku - obrázky - zase ty velikosti atd

    // TODO: 3.2.2017 menší velikost obrázků ?


    // TODO: 1.2.2017 nějaký rychlý tutoriál na github a git

    // TODO: 31.1.2017 dodat výslovnost ke všemu
    // TODO: 31.1.2017 poladit apptheme 
    // TODO: 31.1.2017 doladit design mainactivity 
    // TODO: 31.1.2017 domontovat play ikonu k jednotlivým položkám

    // TODO: 3.2.2017 když něco pustím - změní se ikona na play, když pauznu, změní se na play - odpovídá tomu i to přehrání

    // TODO: 31.1.2017 předělat všechno v barvách na materiální barvy a dodat jich tam pár navíc
    // TODO: 31.1.2017 vyřešit ten audio fokus u všeho


    // TODO: 30.1.2017 emoji art chtějí na ně odkaz viz http://emojione.com/licensing/
    // TODO: 31.1.2017 udělat právě nějakou info aktivitu, kde bude ten emoji odkaz a třeba
    // TODO: 31.1.2017 třeba tlačítko na poslání feedbacku

    // TODO: 31.1.2017 layout a úpravy pro tablety - tam je to hlavně malý, takže udělat verzi layoutů pro tablety

    // TODO: 1.2.2017 upravit si nějak vnitřne ty slovíčka - rozdělit jídlo třeba na jídlo a pití, sladké slané atd

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pripravMenu();
    }


    // připravuje všechny onClickListenery
    private void pripravMenu() {

        TextView prvniKategorie = (TextView) findViewById(R.id.menu_category_1);
        TextView druhaKategorie = (TextView) findViewById(R.id.menu_category_2);
        TextView tretiKategorie = (TextView) findViewById(R.id.menu_category_3);
        TextView ctvrtaKategorie = (TextView) findViewById(R.id.menu_category_4);
        TextView pataKategorie = (TextView) findViewById(R.id.menu_category_5);
        TextView sestaKategorie = (TextView) findViewById(R.id.menu_category_6);
        TextView sedmaKategorie = (TextView) findViewById(R.id.menu_category_7);
        TextView osmaKategorie = (TextView) findViewById(R.id.menu_category_8);
        TextView devataKategorie = (TextView) findViewById(R.id.menu_category_9);
        TextView desataKategorie = (TextView) findViewById(R.id.menu_category_10);

        prvniKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie1.class);
                startActivity(i);
            }
        });

        druhaKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie2.class);
                startActivity(i);
            }
        });

        tretiKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie3.class);
                startActivity(i);
            }
        });

        ctvrtaKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie4.class);
                startActivity(i);
            }
        });

        pataKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie5.class);
                startActivity(i);
            }
        });

        sestaKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie6.class);
                startActivity(i);
            }
        });

        sedmaKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie7.class);
                startActivity(i);
            }
        });

        osmaKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie8.class);
                startActivity(i);
            }
        });


        devataKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie9.class);
                startActivity(i);
            }
        });

        desataKategorie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Kategorie10.class);
                startActivity(i);
            }
        });




    }
}
