package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 29.1.2017.
 */

public class Kategorie9Emoce {

    private Kategorie9Emoce() {
    }


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // bydlení
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("sad", "smutný", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("happy", "veselý",R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("laugh", "smích", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("bored", "znuděný", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("angry", "naštvaný", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("worried", "ustaraný", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("excited", "vzrušený", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("in love", "zamilovaný", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("surprised", "překvapený", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("thinking", "přemýšlející", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("crying", "brečící", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("sleepy", "ospalý", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("dissapointed", "zklamaný", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("embarassed", "ztrapněný", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("thrilled", "natěšený", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("smartass", "chytrolín", R.drawable.smajlik, R.raw.song));



        return slovicka;
    }
}
