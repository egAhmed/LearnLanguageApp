package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie1Zvirata {

    private Kategorie1Zvirata() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // zvířata
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("dog", "pes", R.drawable.zvirata_pes, R.raw.song));
        slovicka.add(new Slovicko("cat", "kočka",R.drawable.zvirata_kocka, R.raw.song));
        slovicka.add(new Slovicko("mouse", "myš", R.drawable.zvirata_mys, R.raw.song));
        slovicka.add(new Slovicko("horse", "kůň", R.drawable.zvirata_kun, R.raw.song));
        slovicka.add(new Slovicko("bear", "medvěd", R.drawable.zvirata_medved, R.raw.song));
        slovicka.add(new Slovicko("turtle", "želva", R.drawable.zvirata_zelva, R.raw.song));
        slovicka.add(new Slovicko("fish", "ryba", R.drawable.zvirata_ryba, R.raw.song));
        slovicka.add(new Slovicko("snake", "had", R.drawable.zvirata_had, R.raw.song));
        slovicka.add(new Slovicko("elephant", "slon", R.drawable.zvirata_slon, R.raw.song));
        slovicka.add(new Slovicko("lion", "lev", R.drawable.zvirata_lev, R.raw.song));

        slovicka.add(new Slovicko("fox", "liška", R.drawable.zvirata_liska, R.raw.song));
        slovicka.add(new Slovicko("rhino", "nosorožec", R.drawable.zvirata_nosorozec, R.raw.song));
        slovicka.add(new Slovicko("sheep", "ovce", R.drawable.zvirata_ovce, R.raw.song));
        slovicka.add(new Slovicko("monkey", "opice", R.drawable.zvirata_opice, R.raw.song));
        slovicka.add(new Slovicko("deer", "jelen", R.drawable.zvirata_jelen, R.raw.song));
        slovicka.add(new Slovicko("koala", "koala", R.drawable.zvirata_koala, R.raw.song));
        slovicka.add(new Slovicko("panda", "panda", R.drawable.zvirata_panda, R.raw.song));
        slovicka.add(new Slovicko("camel", "velbloud", R.drawable.zvirata_velbloud, R.raw.song));
        slovicka.add(new Slovicko("bull", "býk", R.drawable.zvirata_byk, R.raw.song));
        slovicka.add(new Slovicko("rabbit", "králík", R.drawable.zvirata_kralik, R.raw.song));

        slovicka.add(new Slovicko("cow", "kráva", R.drawable.zvirata_krava, R.raw.song));
        slovicka.add(new Slovicko("goat", "koza", R.drawable.zvirata_koza, R.raw.song));
        slovicka.add(new Slovicko("bat", "netopýr", R.drawable.zvirata_netopyr, R.raw.song));
        slovicka.add(new Slovicko("squirrel", "veverka", R.drawable.zvirata_veverka, R.raw.song));
        slovicka.add(new Slovicko("penguin", "tučňák", R.drawable.zvirata_tucnak, R.raw.song));
        slovicka.add(new Slovicko("dolphin", "delfín", R.drawable.zvirata_delfin, R.raw.song));
        slovicka.add(new Slovicko("eagle", "orel", R.drawable.zvirata_orel, R.raw.song));
        slovicka.add(new Slovicko("duck", "kachna", R.drawable.zvirata_kachna, R.raw.song));
        slovicka.add(new Slovicko("shark", "žralok", R.drawable.zvirata_zralok, R.raw.song));
        slovicka.add(new Slovicko("spider", "pavouk", R.drawable.zvirata_pavouk, R.raw.song));

        slovicka.add(new Slovicko("frog", "žába", R.drawable.zvirata_zaba, R.raw.song));
        slovicka.add(new Slovicko("pig", "prase", R.drawable.zvirata_prase, R.raw.song));
        slovicka.add(new Slovicko("wolf", "vlk", R.drawable.zvirata_vlk, R.raw.song));
        slovicka.add(new Slovicko("unicorn", "jednorožec", R.drawable.zvirata_jednorozec, R.raw.song));
        slovicka.add(new Slovicko("chicken", "kuře", R.drawable.zvirata_kure, R.raw.song));
        slovicka.add(new Slovicko("whale", "velryba", R.drawable.zvirata_velryba, R.raw.song));
        slovicka.add(new Slovicko("octopus", "chobotnice", R.drawable.zvirata_chobotnice, R.raw.song));
        slovicka.add(new Slovicko("ant", "mravenec", R.drawable.zvirata_mravenec, R.raw.song));
        slovicka.add(new Slovicko("lady beetle", "beruška", R.drawable.zvirata_beruska, R.raw.song));
        slovicka.add(new Slovicko("butterfly", "motyl", R.drawable.zvirata_motyl, R.raw.song));



        return slovicka;
    }
}
