package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie1Slovicka {

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // zvířata
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("dog", "pes", R.drawable.smajlik));
        slovicka.add(new Slovicko("cat", "kočka",R.drawable.smajlik));
        slovicka.add(new Slovicko("mouse", "myš", R.drawable.smajlik));
        slovicka.add(new Slovicko("horse", "kůň", R.drawable.smajlik));
        slovicka.add(new Slovicko("giraffe", "žirafa", R.drawable.smajlik));
        slovicka.add(new Slovicko("turtle", "želva", R.drawable.smajlik));
        slovicka.add(new Slovicko("fish", "ryba", R.drawable.smajlik));
        slovicka.add(new Slovicko("snake", "had", R.drawable.smajlik));
        slovicka.add(new Slovicko("elephant", "slon", R.drawable.smajlik));
        slovicka.add(new Slovicko("lion", "lev", R.drawable.smajlik));


        return slovicka;
    }
}
