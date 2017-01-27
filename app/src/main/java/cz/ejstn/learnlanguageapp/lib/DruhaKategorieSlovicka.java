package cz.ejstn.learnlanguageapp.lib;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class DruhaKategorieSlovicka {

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("dobrý den", "hello", R.drawable.smajlik));
        slovicka.add(new Slovicko("jak se máš", "how are you",R.drawable.smajlik));
        slovicka.add(new Slovicko("mám se dobře", "i am fine", R.drawable.smajlik));
        slovicka.add(new Slovicko("děkuji", "thank you", R.drawable.smajlik));
        slovicka.add(new Slovicko("prosím", "please", R.drawable.smajlik));
        slovicka.add(new Slovicko("nashledanou", "goodbye", R.drawable.smajlik));
        slovicka.add(new Slovicko("těší mě", "nice to meet you", R.drawable.smajlik));
        slovicka.add(new Slovicko("jmenuji se", "my name is", R.drawable.smajlik));
        slovicka.add(new Slovicko("ahoj", "hi", R.drawable.smajlik));
        slovicka.add(new Slovicko("měj se dobře", "take care", R.drawable.smajlik));


        return slovicka;
    }
}
