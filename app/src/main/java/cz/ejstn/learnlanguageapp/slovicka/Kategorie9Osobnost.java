package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 29.1.2017.
 */

public final class Kategorie9Osobnost {

    private Kategorie9Osobnost() {
    }


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // osobnost a nálada
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {

        // není výslovnost
        //slovicka.add(new Slovicko("bored", "znuděný", R.drawable.osobnost_znudeny, R.raw.bored));
        //slovicka.add(new Slovicko("thrilled", "natěšený", R.drawable.smajlik, R.raw.thrilled));
        // slovicka.add(new Slovicko("smartass", "chytrák", R.drawable.osobnost_chytrak, R.raw.smartass));
        // slovicka.add(new Slovicko("excited", "vzrušený", R.drawable.smajlik, R.raw.excited));

        slovicka.add(new Slovicko("sad", "smutný", R.drawable.osobnost_smutny, R.raw.sad));
        slovicka.add(new Slovicko("happy", "veselý", R.drawable.osobnost_vesely, R.raw.happy));
        slovicka.add(new Slovicko("laughing", "smějící se", R.drawable.osobnost_smejici, R.raw.laughing));
        slovicka.add(new Slovicko("angry", "naštvaný", R.drawable.osobnost_nastvany, R.raw.angry));
        slovicka.add(new Slovicko("worried", "ustaraný", R.drawable.osobnost_ustarany, R.raw.worried));
        slovicka.add(new Slovicko("in love", "zamilovaný", R.drawable.osobnost_zamilovany, R.raw.in_love));
        slovicka.add(new Slovicko("surprised", "překvapený", R.drawable.osobnost_prekvapeny, R.raw.surprised));
        slovicka.add(new Slovicko("thinking", "přemýšlející", R.drawable.osobnost_premyslejici, R.raw.thinking));

        slovicka.add(new Slovicko("crying", "brečící", R.drawable.osobnost_brecici_1, R.raw.crying));
        slovicka.add(new Slovicko("sleepy", "ospalý", R.drawable.osobnost_ospaly, R.raw.sleepy));
        slovicka.add(new Slovicko("disappointed", "zklamaný", R.drawable.osobnost_zklamany, R.raw.disappointed));
        slovicka.add(new Slovicko("embarrassed", "cítit se trapně", R.drawable.osobnost_ztrapneny, R.raw.embarrassed));
        slovicka.add(new Slovicko("innocent", "nevinný", R.drawable.osobnost_nevinny, R.raw.innocent));
        slovicka.add(new Slovicko("ill", "nemocný", R.drawable.osobnost_nemocny, R.raw.ill));
        slovicka.add(new Slovicko("liar", "lhář", R.drawable.osobnost_lhar, R.raw.liar));
        slovicka.add(new Slovicko("annoyed", "otrávený", R.drawable.osobnost_otraveny, R.raw.annoyed));

        slovicka.add(new Slovicko("satisfied", "spokojený", R.drawable.osobnost_spokojeny, R.raw.satisfied));
        slovicka.add(new Slovicko("scared", "vystrašený", R.drawable.osobnost_vystraseny, R.raw.scared));
        slovicka.add(new Slovicko("confused", "zmatený", R.drawable.osobnost_zmateny, R.raw.confused));

        slovicka.add(new Slovicko("dizzy", "mít závrať", R.drawable.osobnost_zavrat, R.raw.dizzy));
        slovicka.add(new Slovicko("astonished", "užaslý", R.drawable.osobnost_uzasly, R.raw.astonished));


        return slovicka;
    }
}
