package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie7Slovicka {


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // sport
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("football", "fotbal", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("ice hockey", "hokej",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("track and field", "atletika", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("basketball", "basketbal", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("baseball", "baseball", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("floorball", "florbal", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("jogging", "běhání", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("bodybuilding", "posilování", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("skiing", "lyžování", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("swimming", "plavání", R.drawable.smajlik, R.raw.song));


        return slovicka;
    }
}
