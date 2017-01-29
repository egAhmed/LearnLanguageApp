package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie7Sport {

    private Kategorie7Sport() {
    }


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // sport
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("football", "fotbal", R.drawable.sport_fotbal, R.raw.song));
        slovicka.add(new Slovicko("ice hockey", "hokej",R.drawable.sport_hokej, R.raw.song));
        slovicka.add(new Slovicko("track and field", "atletika", R.drawable.sport_atletika, R.raw.song));
        slovicka.add(new Slovicko("basketball", "basketbal", R.drawable.sport_basket, R.raw.song));
        slovicka.add(new Slovicko("bicycle", "kolo", R.drawable.sport_kolo, R.raw.song));
        slovicka.add(new Slovicko("archery", "lukostřelba", R.drawable.sport_lukostrelba, R.raw.song));
        slovicka.add(new Slovicko("jogging", "běhání", R.drawable.sport_behani, R.raw.song));
        slovicka.add(new Slovicko("bodybuilding", "posilování", R.drawable.sport_posilovani, R.raw.song));
        slovicka.add(new Slovicko("skiing", "lyžování", R.drawable.sport_lyzovani, R.raw.song));
        slovicka.add(new Slovicko("swimming", "plavání", R.drawable.sport_plavani, R.raw.song));

        slovicka.add(new Slovicko("wrestling", "zápasení", R.drawable.sport_zapaseni, R.raw.song));
        slovicka.add(new Slovicko("boxing", "box", R.drawable.sport_box, R.raw.song));
        slovicka.add(new Slovicko("ice skating", "bruslení", R.drawable.sport_brusleni, R.raw.song));
        slovicka.add(new Slovicko("golf", "golf", R.drawable.sport_golf, R.raw.song));
        slovicka.add(new Slovicko("fencing", "šerm", R.drawable.sport_serm, R.raw.song));
        slovicka.add(new Slovicko("handball", "házená", R.drawable.sport_hazena, R.raw.song));
        slovicka.add(new Slovicko("horse racing", "jízda na koni", R.drawable.sport_jizda_na_koni, R.raw.song));
        slovicka.add(new Slovicko("snowboarding", "jízda na snowboardu", R.drawable.sport_snowboard, R.raw.song));
        slovicka.add(new Slovicko("surfing", "serfování", R.drawable.sport_serfovani, R.raw.song));
        slovicka.add(new Slovicko("rowing", "veslování", R.drawable.sport_veslovani, R.raw.song));
        slovicka.add(new Slovicko("field hockey", "pozemní hokej", R.drawable.sport_pozemni_hokej, R.raw.song));
        slovicka.add(new Slovicko("martial arts", "bojová umění", R.drawable.sport_bojova_umeni, R.raw.song));


        return slovicka;
    }
}
