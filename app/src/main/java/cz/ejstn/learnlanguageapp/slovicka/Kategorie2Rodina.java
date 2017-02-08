package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public final class Kategorie2Rodina {


    private Kategorie2Rodina() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // rodina
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("dad", "táta", R.drawable.rodina_tata, R.raw.dad));
        slovicka.add(new Slovicko("mom", "máma", R.drawable.rodina_mama, R.raw.mom));
        slovicka.add(new Slovicko("sister", "sestra", R.drawable.rodina_sestra, R.raw.sister));
        slovicka.add(new Slovicko("brother", "bratr", R.drawable.rodina_bratr, R.raw.brother));
        slovicka.add(new Slovicko("grandma", "babička", R.drawable.rodina_babicka, R.raw.grandma));
        slovicka.add(new Slovicko("grandad", "dědeček", R.drawable.rodina_deda, R.raw.grandad));
        slovicka.add(new Slovicko("uncle", "strýc", R.drawable.rodina_stryc, R.raw.uncle));
        slovicka.add(new Slovicko("aunt", "teta", R.drawable.rodina_teta, R.raw.aunt));
        slovicka.add(new Slovicko("cousin", "bratranec", R.drawable.rodina_bratranec, R.raw.cousin));
        slovicka.add(new Slovicko("cousin", "sestřenice", R.drawable.rodina_sestrenice, R.raw.cousin));


        return slovicka;
    }
}
