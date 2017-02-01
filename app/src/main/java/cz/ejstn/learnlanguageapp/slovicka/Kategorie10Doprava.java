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
        slovicka.add(new Slovicko("motorboat", "motorová loď", R.drawable.doprava_motorova_lod, R.raw.song));
        slovicka.add(new Slovicko("aircraft", "letadlo", R.drawable.doprava_letadlo, R.raw.song));
        slovicka.add(new Slovicko("train", "vlak", R.drawable.doprava_vlak, R.raw.song));
        slovicka.add(new Slovicko("motorcycle", "motorka", R.drawable.doprava_motorka, R.raw.song));

        slovicka.add(new Slovicko("trolleybus", "trolejbus", R.drawable.doprava_trolejbus, R.raw.song));
        slovicka.add(new Slovicko("tractor", "traktor",R.drawable.doprava_traktor, R.raw.song));
        slovicka.add(new Slovicko("tram", "tramvaj", R.drawable.doprava_tramvaj, R.raw.song));
        slovicka.add(new Slovicko("steam locomotive", "parní lokomotiva", R.drawable.doprava_parni_lokomotiva, R.raw.song));
        slovicka.add(new Slovicko("lorry", "kamion", R.drawable.doprava_kamion, R.raw.song));
        slovicka.add(new Slovicko("ambulance", "sanitka", R.drawable.doprava_sanitka, R.raw.song));
        slovicka.add(new Slovicko("bus stop", "zastávka", R.drawable.doprava_zastavka, R.raw.song));
        slovicka.add(new Slovicko("canoe", "kánoj", R.drawable.doprava_kanoj, R.raw.song));
        slovicka.add(new Slovicko("motorway", "dálnice", R.drawable.doprava_dalnice, R.raw.song));
        slovicka.add(new Slovicko("seat", "sedačka", R.drawable.doprava_sedacka, R.raw.song));

        slovicka.add(new Slovicko("traffic light", "semafor", R.drawable.doprava_semafor, R.raw.song));
        slovicka.add(new Slovicko("gas station", "benzínka", R.drawable.doprava_benzinka, R.raw.song));
        slovicka.add(new Slovicko("anchor", "kotva", R.drawable.doprava_kotva, R.raw.song));
        slovicka.add(new Slovicko("sailboat", "plachetnice", R.drawable.doprava_plachetnice, R.raw.song));
        slovicka.add(new Slovicko("police car", "policejní auto", R.drawable.doprava_policejni_auto, R.raw.song));
        slovicka.add(new Slovicko("ship", "loď", R.drawable.doprava_lod, R.raw.song));
        slovicka.add(new Slovicko("ferry", "trajekt", R.drawable.doprava_trajekt, R.raw.song));
        slovicka.add(new Slovicko("scooter", "koloběžka", R.drawable.doprava_kolobezka, R.raw.song));
        slovicka.add(new Slovicko("railway track", "kolej", R.drawable.doprava_kolej, R.raw.song));



        return slovicka;
    }
}
