package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 29.1.2017.
 */

public class Kategorie9Osobnost {

    private Kategorie9Osobnost() {
    }


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // osobnost a nálada
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("sad", "smutný", R.drawable.osobnost_smutny, R.raw.song));
        slovicka.add(new Slovicko("happy", "veselý",R.drawable.osobnost_vesely, R.raw.song));
        slovicka.add(new Slovicko("laughing", "smějící se", R.drawable.osobnost_smejici, R.raw.song));
        slovicka.add(new Slovicko("bored", "znuděný", R.drawable.osobnost_znudeny, R.raw.song));
        slovicka.add(new Slovicko("angry", "naštvaný", R.drawable.osobnost_nastvany, R.raw.song));
        slovicka.add(new Slovicko("worried", "ustaraný", R.drawable.osobnost_ustarany, R.raw.song));
     // slovicka.add(new Slovicko("excited", "vzrušený", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("in love", "zamilovaný", R.drawable.osobnost_zamilovany, R.raw.song));
        slovicka.add(new Slovicko("surprised", "překvapený", R.drawable.osobnost_prekvapeny, R.raw.song));
        slovicka.add(new Slovicko("thinking", "přemýšlející", R.drawable.osobnost_premyslejici, R.raw.song));

        slovicka.add(new Slovicko("crying", "brečící", R.drawable.osobnost_brecici_1, R.raw.song));
        slovicka.add(new Slovicko("sleepy", "ospalý", R.drawable.osobnost_ospaly, R.raw.song));
        slovicka.add(new Slovicko("disappointed", "zklamaný", R.drawable.osobnost_zklamany, R.raw.song));
        slovicka.add(new Slovicko("embarassed", "cítit se trapně", R.drawable.osobnost_ztrapneny, R.raw.song));
      //slovicka.add(new Slovicko("thrilled", "natěšený", R.drawable.smajlik, R.raw.song));
        slovicka.add(new Slovicko("smartass", "chytrák", R.drawable.osobnost_chytrak, R.raw.song));
        slovicka.add(new Slovicko("innocent", "nevinný", R.drawable.osobnost_nevinny, R.raw.song));
        slovicka.add(new Slovicko("ill", "nemocný", R.drawable.osobnost_nemocny, R.raw.song));
        slovicka.add(new Slovicko("liar", "lhář", R.drawable.osobnost_lhar, R.raw.song));
        slovicka.add(new Slovicko("annoyed", "otrávený", R.drawable.osobnost_otraveny, R.raw.song));

        slovicka.add(new Slovicko("satisfied", "spokojený", R.drawable.osobnost_spokojeny, R.raw.song));
        slovicka.add(new Slovicko("scared", "vystrašený", R.drawable.osobnost_vystraseny, R.raw.song));
        slovicka.add(new Slovicko("confused", "zmatený", R.drawable.osobnost_zmateny, R.raw.song));

        slovicka.add(new Slovicko("dizzy", "mít závrať", R.drawable.osobnost_zavrat, R.raw.song));
        slovicka.add(new Slovicko("astonished", "užaslý", R.drawable.osobnost_uzasly, R.raw.song));
       // slovicka.add(new Slovicko("confused", "zmatený", R.drawable.osobnost_zmateny, R.raw.song));




        return slovicka;
    }
}
