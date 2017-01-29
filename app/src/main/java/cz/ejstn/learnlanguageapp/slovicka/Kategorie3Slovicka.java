package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie3Slovicka {

    private Kategorie3Slovicka() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // jídlo
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("bread", "chleba", R.drawable.jidlo_chleba, R.raw.song));
        slovicka.add(new Slovicko("cookie", "sušenka",R.drawable.jidlo_susenka, R.raw.song));
        slovicka.add(new Slovicko("meat", "maso", R.drawable.jidlo_maso, R.raw.song));
        slovicka.add(new Slovicko("potato", "brambora", R.drawable.jidlo_brambora, R.raw.song));
        slovicka.add(new Slovicko("rice", "rýže", R.drawable.jidlo_ryze, R.raw.song));
        slovicka.add(new Slovicko("pasta", "těstoviny", R.drawable.jidlo_testoviny, R.raw.song));
        slovicka.add(new Slovicko("apple", "jablko", R.drawable.jidlo_jablko, R.raw.song));
        slovicka.add(new Slovicko("cake", "dort", R.drawable.jidlo_dort, R.raw.song));
        slovicka.add(new Slovicko("salad", "salát", R.drawable.jidlo_salat, R.raw.song));
        slovicka.add(new Slovicko("donut", "kobliha", R.drawable.jidlo_kobliha, R.raw.song));


        return slovicka;
    }
}
