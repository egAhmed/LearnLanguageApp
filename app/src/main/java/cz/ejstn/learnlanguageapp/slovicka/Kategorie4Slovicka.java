package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie4Slovicka {

    private Kategorie4Slovicka() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // čísla
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("one", "jedna", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("two", "dva",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("three", "tři", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("four", "čtyři", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("five", "pět", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("six", "šest", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("seven", "sedm", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("eight", "osm", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("nine", "devět", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("ten", "deset", R.drawable.smajlik, R.raw.song));


        return slovicka;
    }
}
