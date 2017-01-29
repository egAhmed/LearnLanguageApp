package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie3Slovicka {

    private Kategorie3Slovicka() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // jídlo
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("bread", "chleba", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("butter", "máslo",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("meat", "maso", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("potato", "brambora", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("rice", "rýže", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("pasta", "těstoviny", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("apple", "jablko", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("cereal", "cereálie", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("yogurt", "jogurt", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("donut", "kobliha", R.drawable.smajlik, R.raw.song));


        return slovicka;
    }
}
