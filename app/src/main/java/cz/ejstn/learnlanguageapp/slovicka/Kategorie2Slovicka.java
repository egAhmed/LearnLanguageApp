package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie2Slovicka {


    private Kategorie2Slovicka() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // rodina
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("dad", "táta", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("mom", "máma",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("sister", "sestra", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("brother", "bratr", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("grandma", "babička", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("grandad", "dědeček", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("uncle", "strýc", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("aunt", "teta", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("cousin", "bratranec", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("cousin", "sestřenice", R.drawable.smajlik, R.raw.song));


        return slovicka;
    }
}
