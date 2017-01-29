package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie5Slovicka {

    private Kategorie5Slovicka() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // barvy
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("green", "zelená", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("blue", "modrá",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("purple", "fialová", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("pink", "růžová", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("red", "červená", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("orange", "oranžová", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("yellow", "žlutá", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("white", "bílá", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("brown", "hnědá", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("black", "černá", R.drawable.smajlik, R.raw.song));

        return slovicka;
    }
}
