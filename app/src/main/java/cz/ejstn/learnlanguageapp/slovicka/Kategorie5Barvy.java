package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie5Barvy {

    private Kategorie5Barvy() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // TODO: 30.1.2017 materiální barvy by byly asi lepší

    // barvy
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("green", "zelená", R.drawable.barvy_zelena, R.raw.song));
        slovicka.add(new Slovicko("blue", "modrá",R.drawable.barvy_modra, R.raw.song));
        slovicka.add(new Slovicko("purple", "fialová", R.drawable.barvy_fialova, R.raw.song));
        slovicka.add(new Slovicko("pink", "růžová", R.drawable.barvy_ruzova, R.raw.song));
        slovicka.add(new Slovicko("red", "červená", R.drawable.barvy_cervena, R.raw.song));
        slovicka.add(new Slovicko("orange", "oranžová", R.drawable.barvy_oranzova, R.raw.song));
        slovicka.add(new Slovicko("yellow", "žlutá", R.drawable.barvy_zluta, R.raw.song));
        slovicka.add(new Slovicko("white", "bílá", R.drawable.barvy_bila, R.raw.song));
        slovicka.add(new Slovicko("brown", "hnědá", R.drawable.barvy_hneda, R.raw.song));
        slovicka.add(new Slovicko("black", "černá", R.drawable.barvy_cerna, R.raw.song));

        return slovicka;
    }
}
