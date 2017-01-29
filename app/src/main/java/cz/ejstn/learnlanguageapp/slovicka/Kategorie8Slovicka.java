package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie8Slovicka {

    private Kategorie8Slovicka() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // příroda
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("mountaint", "hory", R.drawable.priroda_hory, R.raw.song));
        slovicka.add(new Slovicko("valley", "údolí", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("forest", "les", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("river", "řeka", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("lake", "jezero", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("sea", "moře", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("island", "ostrov",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("waterfall", "vodopád", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("beach", "pláž", R.drawable.priroda_plaz, R.raw.song));
        slovicka.add(new Slovicko("park", "park", R.drawable.smajlik, R.raw.song));


        return slovicka;
    }
}
