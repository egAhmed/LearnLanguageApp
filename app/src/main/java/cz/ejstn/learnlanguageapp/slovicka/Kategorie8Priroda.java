package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 28.1.2017.
 */

public class Kategorie8Priroda {

    private Kategorie8Priroda() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // příroda a počasí
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {

        // není obrázek

        /*
        slovicka.add(new Slovicko("valley", "údolí", R.drawable.priroda_udoli, R.raw.valley));
        slovicka.add(new Slovicko("forest", "les", R.drawable.priroda_les, R.raw.forest));
        slovicka.add(new Slovicko("river", "řeka", R.drawable.priroda_reka, R.raw.river));
        slovicka.add(new Slovicko("lake", "jezero", R.drawable.priroda_jezero, R.raw.lake));
        slovicka.add(new Slovicko("sea", "moře", R.drawable.priroda_more, R.raw.sea));
        slovicka.add(new Slovicko("waterfall", "vodopád", R.drawable.priroda_vodopad, R.raw.waterfall));
        slovicka.add(new Slovicko("park", "park", R.drawable.priroda_park, R.raw.park));
         */

        // není výslovnost
        /*
        slovicka.add(new Slovicko("desert", "poušť", R.drawable.priroda_poust, R.raw.desert));
        slovicka.add(new Slovicko("wind", "vítr", R.drawable.priroda_vitr, R.raw.wind));
        slovicka.add(new Slovicko("four leaf clover", "čtyřlístek", R.drawable.priroda_ctyrlistek, R.raw.four_leaf_clover));
        */



        // PŘÍRODA

        // POČASÍ
        slovicka.add(new Slovicko("cloud", "mrak", R.drawable.priroda_mrak, R.raw.cloud));

        slovicka.add(new Slovicko("island", "ostrov", R.drawable.priroda_ostrov, R.raw.island));
        slovicka.add(new Slovicko("mountain", "hora", R.drawable.priroda_hora, R.raw.mountain));
        slovicka.add(new Slovicko("beach", "pláž", R.drawable.priroda_plaz, R.raw.beach));

        slovicka.add(new Slovicko("droplet", "kapka", R.drawable.priroda_kapka, R.raw.droplet));
        slovicka.add(new Slovicko("tree", "strom", R.drawable.priroda_strom, R.raw.tree));
        slovicka.add(new Slovicko("plant", "rostlina", R.drawable.priroda_rostlina, R.raw.plant));
        slovicka.add(new Slovicko("palm", "palma", R.drawable.priroda_palma, R.raw.palm));
        slovicka.add(new Slovicko("cactus", "kaktus", R.drawable.priroda_kaktus, R.raw.cactus));
        slovicka.add(new Slovicko("herb", "bylina", R.drawable.priroda_bylina, R.raw.herb));
        slovicka.add(new Slovicko("shamrock", "trojlístek", R.drawable.priroda_trojlistek, R.raw.shamrock));

        slovicka.add(new Slovicko("bouquet", "kytice", R.drawable.priroda_kytice, R.raw.bouquet));
        slovicka.add(new Slovicko("rose", "růže", R.drawable.priroda_ruze, R.raw.rose));
        slovicka.add(new Slovicko("hibiscus", "ibišek", R.drawable.priroda_ibisek, R.raw.hibiscus));
        slovicka.add(new Slovicko("sunflower", "slunečnice", R.drawable.priroda_slunecnice, R.raw.sunflower));
        slovicka.add(new Slovicko("blossom", "květ", R.drawable.priroda_kvet, R.raw.blossom));
        slovicka.add(new Slovicko("tulip", "tulipán", R.drawable.priroda_tulipan, R.raw.tulip));
        slovicka.add(new Slovicko("maple", "javor", R.drawable.priroda_javor, R.raw.maple));

        slovicka.add(new Slovicko("leaf", "list", R.drawable.priroda_list, R.raw.leaf));
        slovicka.add(new Slovicko("mushroom", "houba", R.drawable.priroda_houba, R.raw.mushroom));
        slovicka.add(new Slovicko("chestnut", "kaštan", R.drawable.priroda_kastan, R.raw.chestnut));
        slovicka.add(new Slovicko("sun", "slunce", R.drawable.priroda_slunce, R.raw.sun));
        slovicka.add(new Slovicko("moon", "měsíc", R.drawable.priroda_mesic, R.raw.moon));
        slovicka.add(new Slovicko("earth", "země", R.drawable.priroda_zeme, R.raw.earth));
        slovicka.add(new Slovicko("storm", "bouřka", R.drawable.priroda_bourka, R.raw.storm));

        slovicka.add(new Slovicko("rain", "déšť", R.drawable.priroda_dest, R.raw.rain));
        slovicka.add(new Slovicko("snow", "sníh", R.drawable.priroda_snih, R.raw.snow));
        slovicka.add(new Slovicko("lightning", "blesk", R.drawable.priroda_blesk, R.raw.lightning));
        slovicka.add(new Slovicko("tornado", "tornádo", R.drawable.priroda_tornado, R.raw.tornado));
        slovicka.add(new Slovicko("fog", "mlha", R.drawable.priroda_mlha, R.raw.fog));
        slovicka.add(new Slovicko("snowflake", "sněhová vločka", R.drawable.priroda_snehova_vlocka, R.raw.snowflake));
        slovicka.add(new Slovicko("snowman", "sněhulák", R.drawable.priroda_snehulak, R.raw.snowman));

        slovicka.add(new Slovicko("comet", "kometa", R.drawable.priroda_kometa, R.raw.comet));
        slovicka.add(new Slovicko("wave", "vlna", R.drawable.priroda_vlna, R.raw.wave));
        slovicka.add(new Slovicko("fire", "oheň", R.drawable.priroda_ohen, R.raw.fire));
        slovicka.add(new Slovicko("umbrella", "deštník", R.drawable.priroda_destnik, R.raw.umbrella));
        slovicka.add(new Slovicko("volcano", "sopka", R.drawable.priroda_sopka, R.raw.volcano));
        slovicka.add(new Slovicko("national park", "národní park", R.drawable.priroda_narodni_park, R.raw.national_park));

        return slovicka;
    }
}
