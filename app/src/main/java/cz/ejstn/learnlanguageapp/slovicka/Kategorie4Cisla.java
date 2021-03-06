package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public final class Kategorie4Cisla {

    private Kategorie4Cisla() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // čísla
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("one", "jedna", R.drawable.cisla_jedna, R.raw.one));
        slovicka.add(new Slovicko("two", "dva", R.drawable.cisla_dva, R.raw.two));
        slovicka.add(new Slovicko("three", "tři", R.drawable.cisla_tri, R.raw.three));
        slovicka.add(new Slovicko("four", "čtyři", R.drawable.cisla_ctyri, R.raw.four));
        slovicka.add(new Slovicko("five", "pět", R.drawable.cisla_pet, R.raw.five));
        slovicka.add(new Slovicko("six", "šest", R.drawable.cisla_sest, R.raw.six));
        slovicka.add(new Slovicko("seven", "sedm", R.drawable.cisla_sedm, R.raw.seven));
        slovicka.add(new Slovicko("eight", "osm", R.drawable.cisla_osm, R.raw.eight));
        slovicka.add(new Slovicko("nine", "devět", R.drawable.cisla_devet, R.raw.nine));
        slovicka.add(new Slovicko("ten", "deset", R.drawable.cisla_deset, R.raw.ten));


        return slovicka;
    }
}
