package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public final class Kategorie1Zvirata {

    private Kategorie1Zvirata() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // zvířata
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {

        // chybějící výslovnost
        // slovicka.add(new Slovicko("lady beetle", "beruška", R.drawable.zvirata_beruska, R.raw.lady_beetle));

        // VODNÍ
        slovicka.add(new Slovicko("fish", "ryba", R.drawable.zvirata_ryba, R.raw.fish));
        slovicka.add(new Slovicko("turtle", "želva", R.drawable.zvirata_zelva, R.raw.turtle));
        slovicka.add(new Slovicko("penguin", "tučňák", R.drawable.zvirata_tucnak, R.raw.penguin));
        slovicka.add(new Slovicko("duck", "kachna", R.drawable.zvirata_kachna, R.raw.duck));
        slovicka.add(new Slovicko("squid", "oliheň", R.drawable.zvirata_olihen, R.raw.squid));
        slovicka.add(new Slovicko("dolphin", "delfín", R.drawable.zvirata_delfin, R.raw.dolphin));
        slovicka.add(new Slovicko("shark", "žralok", R.drawable.zvirata_zralok, R.raw.shark));
        slovicka.add(new Slovicko("crab", "krab", R.drawable.zvirata_krab, R.raw.crab));
        slovicka.add(new Slovicko("whale", "velryba", R.drawable.zvirata_velryba, R.raw.whale));
        slovicka.add(new Slovicko("shrimp", "kreveta", R.drawable.zvirata_kreveta, R.raw.shrimp));
        slovicka.add(new Slovicko("octopus", "chobotnice", R.drawable.zvirata_chobotnice, R.raw.octopus));

        // KOŇOVITÍ
        slovicka.add(new Slovicko("rhinoceros", "nosorožec", R.drawable.zvirata_nosorozec, R.raw.rhinoceros));
        slovicka.add(new Slovicko("horse", "kůň", R.drawable.zvirata_kun, R.raw.horse));
        slovicka.add(new Slovicko("bull", "býk", R.drawable.zvirata_byk, R.raw.bull));
        slovicka.add(new Slovicko("camel", "velbloud", R.drawable.zvirata_velbloud, R.raw.camel));
        slovicka.add(new Slovicko("deer", "jelen", R.drawable.zvirata_jelen, R.raw.deer));
        slovicka.add(new Slovicko("ram", "beran", R.drawable.zvirata_beran, R.raw.ram));
        slovicka.add(new Slovicko("goat", "koza", R.drawable.zvirata_koza, R.raw.goat));
        slovicka.add(new Slovicko("sheep", "ovce", R.drawable.zvirata_ovce, R.raw.sheep));
        slovicka.add(new Slovicko("unicorn", "jednorožec", R.drawable.zvirata_jednorozec, R.raw.unicorn));
        slovicka.add(new Slovicko("cow", "kráva", R.drawable.zvirata_krava, R.raw.cow));

        // DOMÁCÍ MAZLÍČCI
        slovicka.add(new Slovicko("dog", "pes", R.drawable.zvirata_pes, R.raw.dog));
        slovicka.add(new Slovicko("cat", "kočka", R.drawable.zvirata_kocka, R.raw.cat));
        slovicka.add(new Slovicko("rabbit", "králík", R.drawable.zvirata_kralik, R.raw.rabbit));
        slovicka.add(new Slovicko("hamster", "křeček", R.drawable.zvirata_krecek, R.raw.hamster));
        slovicka.add(new Slovicko("mouse", "myš", R.drawable.zvirata_mys, R.raw.mouse));

        // HMYZ
        slovicka.add(new Slovicko("ant", "mravenec", R.drawable.zvirata_mravenec, R.raw.ant));
        slovicka.add(new Slovicko("spider", "pavouk", R.drawable.zvirata_pavouk, R.raw.spider));
        slovicka.add(new Slovicko("butterfly", "motýl", R.drawable.zvirata_motyl, R.raw.butterfly));
        slovicka.add(new Slovicko("snail", "šnek", R.drawable.zvirata_snek, R.raw.snail));

        // LÍTACÍ ptáci
        slovicka.add(new Slovicko("bat", "netopýr", R.drawable.zvirata_netopyr, R.raw.bat));
        slovicka.add(new Slovicko("eagle", "orel", R.drawable.zvirata_orel, R.raw.eagle));
        slovicka.add(new Slovicko("turkey", "krocan", R.drawable.zvirata_krocan, R.raw.turkey));
        slovicka.add(new Slovicko("chicken", "kuře", R.drawable.zvirata_kure, R.raw.chicken));

        //PLAZI
        slovicka.add(new Slovicko("frog", "žába", R.drawable.zvirata_zaba, R.raw.frog));
        slovicka.add(new Slovicko("lizard", "ještěrka", R.drawable.zvirata_jesterka, R.raw.lizard));


        // ŠELMY
        slovicka.add(new Slovicko("lion", "lev", R.drawable.zvirata_lev, R.raw.lion));
        slovicka.add(new Slovicko("fox", "liška", R.drawable.zvirata_liska, R.raw.fox));
        slovicka.add(new Slovicko("wolf", "vlk", R.drawable.zvirata_vlk, R.raw.wolf));

        // zatím nerozřazeno
        slovicka.add(new Slovicko("bear", "medvěd", R.drawable.zvirata_medved, R.raw.bear));
        slovicka.add(new Slovicko("snake", "had", R.drawable.zvirata_had, R.raw.snake));
        slovicka.add(new Slovicko("elephant", "slon", R.drawable.zvirata_slon, R.raw.elephant));
        slovicka.add(new Slovicko("monkey", "opice", R.drawable.zvirata_opice, R.raw.monkey));
        slovicka.add(new Slovicko("koala", "koala", R.drawable.zvirata_koala, R.raw.koala));
        slovicka.add(new Slovicko("panda", "panda", R.drawable.zvirata_panda, R.raw.panda));
        //slovicka.add(new Slovicko("squirrel", "veverka", R.drawable.zvirata_veverka, R.raw.squirrel));
        slovicka.add(new Slovicko("pig", "prase", R.drawable.zvirata_prase, R.raw.pig));
        slovicka.add(new Slovicko("gorilla", "gorila", R.drawable.zvirata_gorila, R.raw.gorilla));




        return slovicka;
    }
}
