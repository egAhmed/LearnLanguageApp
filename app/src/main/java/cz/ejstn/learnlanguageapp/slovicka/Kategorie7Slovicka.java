package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie7Slovicka {

    private Kategorie7Slovicka() {
    }


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // sport
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("football", "fotbal", R.drawable.sport_fotbal, R.raw.song));
        slovicka.add(new Slovicko("ice hockey", "hokej",R.drawable.sport_hokej, R.raw.song));
        slovicka.add(new Slovicko("track and field", "atletika", R.drawable.sport_atletika, R.raw.song));
        slovicka.add(new Slovicko("basketball", "basketbal", R.drawable.sport_basket, R.raw.song));
        slovicka.add(new Slovicko("bicycle", "kolo", R.drawable.sport_kolo, R.raw.song));
        slovicka.add(new Slovicko("archery", "lukostřelba", R.drawable.sport_lukostrelba, R.raw.song));
        slovicka.add(new Slovicko("jogging", "běhání", R.drawable.sport_behani, R.raw.song));
        slovicka.add(new Slovicko("bodybuilding", "posilování", R.drawable.sport_posilovani, R.raw.song));
        slovicka.add(new Slovicko("skiing", "lyžování", R.drawable.sport_lyzovani, R.raw.song));
        slovicka.add(new Slovicko("swimming", "plavání", R.drawable.sport_plavani, R.raw.song));


        return slovicka;
    }
}
