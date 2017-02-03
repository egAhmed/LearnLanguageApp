package cz.ejstn.learnlanguageapp.slovickaNepouzivana;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie11Bydleni {

    private Kategorie11Bydleni() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // bydlení
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("house", "dům", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("flat", "byt",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("block of flats", "panelák", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("cottage", "chata", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("castle", "zámek", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("stairs", "schody", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("ground floor", "přízemí", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("elevator", "výtah", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("roof", "střecha", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("room", "pokoj", R.drawable.smajlik, R.raw.song));






        return slovicka;
    }
}
