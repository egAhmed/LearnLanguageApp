package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie8Slovicka {

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // příroda
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("mountaint", "hory", R.drawable.smajlik));
        slovicka.add(new Slovicko("plains", "pláně",R.drawable.smajlik));
        slovicka.add(new Slovicko("valley", "údolí", R.drawable.smajlik));
        slovicka.add(new Slovicko("forest", "les", R.drawable.smajlik));
        slovicka.add(new Slovicko("river", "řeka", R.drawable.smajlik));
        slovicka.add(new Slovicko("lake", "jezero", R.drawable.smajlik));
        slovicka.add(new Slovicko("sea", "moře", R.drawable.smajlik));
        slovicka.add(new Slovicko("waterfall", "vodopád", R.drawable.smajlik));
        slovicka.add(new Slovicko("beach", "pláž", R.drawable.smajlik));
        slovicka.add(new Slovicko("park", "park", R.drawable.smajlik));


        return slovicka;
    }
}
