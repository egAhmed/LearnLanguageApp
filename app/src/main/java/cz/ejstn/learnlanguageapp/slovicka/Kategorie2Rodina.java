package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie2Rodina {


    private Kategorie2Rodina() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // rodina
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("dad", "táta", R.drawable.rodina_tata, R.raw.song));
        slovicka.add(new Slovicko("mom", "máma",R.drawable.rodina_mama, R.raw.song));
        slovicka.add(new Slovicko("sister", "sestra", R.drawable.rodina_sestra, R.raw.song));
        slovicka.add(new Slovicko("brother", "bratr", R.drawable.rodina_bratr, R.raw.song));
        slovicka.add(new Slovicko("grandma", "babička", R.drawable.rodina_babicka, R.raw.song));
        slovicka.add(new Slovicko("grandad", "dědeček", R.drawable.rodina_deda, R.raw.song));
        slovicka.add(new Slovicko("uncle", "strýc", R.drawable.rodina_stryc, R.raw.song));
        slovicka.add(new Slovicko("aunt", "teta", R.drawable.rodina_teta, R.raw.song));
        slovicka.add(new Slovicko("cousin", "bratranec", R.drawable.rodina_bratranec, R.raw.song));
        slovicka.add(new Slovicko("cousin", "sestřenice", R.drawable.rodina_sestrenice, R.raw.song));


        return slovicka;
    }
}
