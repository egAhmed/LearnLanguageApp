package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie10Doprava {

    private Kategorie10Doprava() {
    }


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // doprava
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("car", "auto", R.drawable.doprava_auto, R.raw.song));
        slovicka.add(new Slovicko("bus", "autobus",R.drawable.doprava_autobus, R.raw.song));
        slovicka.add(new Slovicko("bicycle", "kolo", R.drawable.doprava_kolo, R.raw.song));
        slovicka.add(new Slovicko("space ship", "vesmírná loď", R.drawable.doprava_vesmirna_lod, R.raw.song));
        slovicka.add(new Slovicko("subway", "metro", R.drawable.doprava_metro, R.raw.song));
        slovicka.add(new Slovicko("taxi", "taxi", R.drawable.doprava_taxi, R.raw.song));
        slovicka.add(new Slovicko("ship", "loď", R.drawable.doprava_lod, R.raw.song));
        slovicka.add(new Slovicko("aircraft", "letadlo", R.drawable.doprava_letadlo, R.raw.song));
        slovicka.add(new Slovicko("train", "vlak", R.drawable.doprava_vlak, R.raw.song));
        slovicka.add(new Slovicko("motorcycle", "motorka", R.drawable.doprava_motorka, R.raw.song));


        return slovicka;
    }
}
