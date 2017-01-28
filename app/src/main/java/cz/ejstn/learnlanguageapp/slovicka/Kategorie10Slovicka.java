package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie10Slovicka {


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // doprava
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("car", "auto", R.drawable.smajlik));
        slovicka.add(new Slovicko("bus", "autobus",R.drawable.smajlik));
        slovicka.add(new Slovicko("bicycle", "kolo", R.drawable.smajlik));
        slovicka.add(new Slovicko("tram", "tramvaj", R.drawable.smajlik));
        slovicka.add(new Slovicko("subway", "metro", R.drawable.smajlik));
        slovicka.add(new Slovicko("taxi", "taxi", R.drawable.smajlik));
        slovicka.add(new Slovicko("ship", "loď", R.drawable.smajlik));
        slovicka.add(new Slovicko("aircraft", "letadlo", R.drawable.smajlik));
        slovicka.add(new Slovicko("train", "vlak", R.drawable.smajlik));
        slovicka.add(new Slovicko("motorcycle", "motorka", R.drawable.smajlik));


        return slovicka;
    }
}
