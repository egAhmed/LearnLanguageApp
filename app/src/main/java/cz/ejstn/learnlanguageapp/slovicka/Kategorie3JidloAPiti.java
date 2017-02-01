package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie3JidloAPiti {

    private Kategorie3JidloAPiti() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // jídlo
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("bread", "chleba", R.drawable.jidlo_chleba, R.raw.song));
        slovicka.add(new Slovicko("cookie", "sušenka",R.drawable.jidlo_susenka, R.raw.song));
        slovicka.add(new Slovicko("meat", "maso", R.drawable.jidlo_maso, R.raw.song));
        slovicka.add(new Slovicko("potato", "brambora", R.drawable.jidlo_brambora, R.raw.song));
        slovicka.add(new Slovicko("rice", "rýže", R.drawable.jidlo_ryze, R.raw.song));
        slovicka.add(new Slovicko("pasta", "těstoviny", R.drawable.jidlo_testoviny, R.raw.song));
        slovicka.add(new Slovicko("apple", "jablko", R.drawable.jidlo_jablko, R.raw.song));
        slovicka.add(new Slovicko("cake", "dort", R.drawable.jidlo_dort, R.raw.song));
        slovicka.add(new Slovicko("salad", "salát", R.drawable.jidlo_salat, R.raw.song));
        slovicka.add(new Slovicko("donut", "kobliha", R.drawable.jidlo_kobliha, R.raw.song));

        slovicka.add(new Slovicko("coffee", "káva", R.drawable.jidlo_kava, R.raw.song));
        slovicka.add(new Slovicko("ice cream", "zmrzlina",R.drawable.jidlo_zmrzlina, R.raw.song));
        slovicka.add(new Slovicko("french fries", "hranolky", R.drawable.jidlo_hranolky, R.raw.song));
        slovicka.add(new Slovicko("pizza", "pizza", R.drawable.jidlo_pizza, R.raw.song));
        slovicka.add(new Slovicko("cheese", "sýr", R.drawable.jidlo_syr, R.raw.song));
        slovicka.add(new Slovicko("peanut", "burák", R.drawable.jidlo_burak, R.raw.song));
        slovicka.add(new Slovicko("lolipop", "lízátko", R.drawable.jidlo_lizatko, R.raw.song));
        slovicka.add(new Slovicko("hotdog", "párek v rohlíku", R.drawable.jidlo_parek_v_rohliku, R.raw.song));
        slovicka.add(new Slovicko("tomato", "rajče", R.drawable.jidlo_rajce, R.raw.song));
        slovicka.add(new Slovicko("watermelon", "vodní meloun", R.drawable.jidlo_vodni_meloun, R.raw.song));

        slovicka.add(new Slovicko("bacon", "slanina", R.drawable.jidlo_slanina, R.raw.song));
        slovicka.add(new Slovicko("cucumber", "okurka",R.drawable.jidlo_okurka, R.raw.song));
        slovicka.add(new Slovicko("pear", "hruška", R.drawable.jidlo_hruska, R.raw.song));
        slovicka.add(new Slovicko("banana", "banán", R.drawable.jidlo_banan, R.raw.song));
        slovicka.add(new Slovicko("pancakes", "palačinky", R.drawable.jidlo_palacinky, R.raw.song));
        slovicka.add(new Slovicko("omelette", "omeleta", R.drawable.jidlo_omeleta, R.raw.song));
        slovicka.add(new Slovicko("carrot", "mrkev", R.drawable.jidlo_mrkev, R.raw.song));
        slovicka.add(new Slovicko("strawberry", "jahoda", R.drawable.jidlo_jahoda, R.raw.song));
        slovicka.add(new Slovicko("milk", "mléko", R.drawable.jidlo_mleko, R.raw.song));
        slovicka.add(new Slovicko("tea", "čaj", R.drawable.jidlo_caj, R.raw.song));

        slovicka.add(new Slovicko("wine", "víno", R.drawable.jidlo_vino, R.raw.song));
        slovicka.add(new Slovicko("chocolate", "čokoláda", R.drawable.jidlo_cokolada, R.raw.song));
        slovicka.add(new Slovicko("beer", "pivo", R.drawable.jidlo_pivo, R.raw.song));
        slovicka.add(new Slovicko("candy", "bonbón", R.drawable.jidlo_bonbon, R.raw.song));
        slovicka.add(new Slovicko("birthday cake", "narozeninový dort", R.drawable.jidlo_narozeninovy_dort, R.raw.song));
        slovicka.add(new Slovicko("corn", "kukuřice", R.drawable.jidlo_kukurice, R.raw.song));
        slovicka.add(new Slovicko("grapes", "hroznové víno", R.drawable.jidlo_hroznove_vino, R.raw.song));
        slovicka.add(new Slovicko("lemon", "citron", R.drawable.jidlo_citron, R.raw.song));
        slovicka.add(new Slovicko("peach", "broskev", R.drawable.jidlo_broskev, R.raw.song));
        slovicka.add(new Slovicko("avocado", "avokádo", R.drawable.jidlo_avokado, R.raw.song));

        slovicka.add(new Slovicko("honey", "med", R.drawable.jidlo_med, R.raw.song));
        slovicka.add(new Slovicko("hot pepper", "chilli paprička", R.drawable.jidlo_chilli_papricka, R.raw.song));
        slovicka.add(new Slovicko("sweet potato", "batát", R.drawable.jidlo_batat, R.raw.song));


        return slovicka;
    }
}
