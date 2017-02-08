package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public final class Kategorie7Sport {

    private Kategorie7Sport() {
    }


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // sport
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {
        // není výslovnost
        //slovicka.add(new Slovicko("jogging", "běhání", R.drawable.sport_behani, R.raw.jogging));
        //slovicka.add(new Slovicko("snowboarding", "jízda na snowboardu", R.drawable.sport_snowboard, R.raw.snowboarding));
        //slovicka.add(new Slovicko("martial arts", "bojová umění", R.drawable.sport_bojova_umeni, R.raw.martial arts));
        //slovicka.add(new Slovicko("second place", "druhé místo", R.drawable.sport_druhe_misto, R.raw.second_place));
        //slovicka.add(new Slovicko("third place", "třetí místo", R.drawable.sport_treti_misto, R.raw.third_place));
        //  slovicka.add(new Slovicko("first place", "první místo", R.drawable.sport_prvni_misto, R.raw.first_place));
        //slovicka.add(new Slovicko("american football", "americký fotbal", R.drawable.sport_americky_fotbal, R.raw.american football));


        slovicka.add(new Slovicko("football", "fotbal", R.drawable.sport_fotbal, R.raw.football));
        slovicka.add(new Slovicko("ice hockey", "hokej", R.drawable.sport_hokej, R.raw.ice_hockey));
        slovicka.add(new Slovicko("track and field", "atletika", R.drawable.sport_atletika, R.raw.track_and_field));
        slovicka.add(new Slovicko("basketball", "basketbal", R.drawable.sport_basket, R.raw.basketball));
        slovicka.add(new Slovicko("bicycle", "kolo", R.drawable.sport_kolo, R.raw.bicycle));
        slovicka.add(new Slovicko("archery", "lukostřelba", R.drawable.sport_lukostrelba, R.raw.archery));
        slovicka.add(new Slovicko("bodybuilding", "posilování", R.drawable.sport_posilovani, R.raw.bodybuilding));
        slovicka.add(new Slovicko("skiing", "lyžování", R.drawable.sport_lyzovani, R.raw.skiing));
        slovicka.add(new Slovicko("swimming", "plavání", R.drawable.sport_plavani, R.raw.swimming));

        slovicka.add(new Slovicko("wrestling", "zápasení", R.drawable.sport_zapaseni, R.raw.wrestling));
        slovicka.add(new Slovicko("boxing", "box", R.drawable.sport_box, R.raw.boxing));
        slovicka.add(new Slovicko("ice skating", "bruslení", R.drawable.sport_brusleni, R.raw.ice_skating));
        slovicka.add(new Slovicko("golf", "golf", R.drawable.sport_golf, R.raw.golf));
        slovicka.add(new Slovicko("fencing", "šerm", R.drawable.sport_serm, R.raw.fencing));
        slovicka.add(new Slovicko("handball", "házená", R.drawable.sport_hazena, R.raw.handball));
        slovicka.add(new Slovicko("horse riding", "jízda na koni", R.drawable.sport_jizda_na_koni, R.raw.horse_riding));
        slovicka.add(new Slovicko("surfing", "serfování", R.drawable.sport_serfovani, R.raw.surfing));
        slovicka.add(new Slovicko("field hockey", "pozemní hokej", R.drawable.sport_pozemni_hokej, R.raw.field_hockey));
        slovicka.add(new Slovicko("table tennis", "ping pong", R.drawable.sport_ping_pong, R.raw.table_tennis));

        slovicka.add(new Slovicko("trophy", "trofej", R.drawable.sport_trofej, R.raw.trophy));
        slovicka.add(new Slovicko("tennis", "tenis", R.drawable.sport_tenis, R.raw.tennis));
        slovicka.add(new Slovicko("rowing", "veslování", R.drawable.sport_veslovani, R.raw.rowing));
        slovicka.add(new Slovicko("medal", "medaile", R.drawable.sport_medaile, R.raw.medal));
        slovicka.add(new Slovicko("water polo", "vodní pólo", R.drawable.sport_vodni_polo, R.raw.water_polo));
        slovicka.add(new Slovicko("badminton", "badminton", R.drawable.sport_badminton, R.raw.badminton));


        return slovicka;
    }
}
