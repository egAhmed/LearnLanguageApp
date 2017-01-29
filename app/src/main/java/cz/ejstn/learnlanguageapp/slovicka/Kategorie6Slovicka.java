package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie6Slovicka {

    private Kategorie6Slovicka() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // volný čas
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("reading", "čtení", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("listen to music", "poslouchat hudbu",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("watch tv", "sledovat televizi", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("go for a walk", "jít na procházku", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("play video games", "hrát videohry", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("gardening", "zahradničení", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("excercising", "cvičení", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("cooking", "vaření", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("shopping", "nakupování", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("surf the internet", "brouzdat na internetu", R.drawable.smajlik, R.raw.song));


        return slovicka;
    }
}
