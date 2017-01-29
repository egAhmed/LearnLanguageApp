package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie1Zvirata {

    private Kategorie1Zvirata() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // zvířata
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("dog", "pes", R.drawable.zvirata_pes, R.raw.song));
        slovicka.add(new Slovicko("cat", "kočka",R.drawable.zvirata_kocka, R.raw.song));
        slovicka.add(new Slovicko("mouse", "myš", R.drawable.zvirata_mys, R.raw.song));
        slovicka.add(new Slovicko("horse", "kůň", R.drawable.zvirata_kun, R.raw.song));
        slovicka.add(new Slovicko("bear", "medvěd", R.drawable.zvirata_medved, R.raw.song));
        slovicka.add(new Slovicko("turtle", "želva", R.drawable.zvirata_zelva, R.raw.song));
        slovicka.add(new Slovicko("fish", "ryba", R.drawable.zvirata_ryba, R.raw.song));
        slovicka.add(new Slovicko("snake", "had", R.drawable.zvirata_had, R.raw.song));
        slovicka.add(new Slovicko("elephant", "slon", R.drawable.zvirata_slon, R.raw.song));
        slovicka.add(new Slovicko("lion", "lev", R.drawable.zvirata_lev, R.raw.song));


        return slovicka;
    }
}
