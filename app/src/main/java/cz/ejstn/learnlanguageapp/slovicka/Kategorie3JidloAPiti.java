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
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {


        //PITÍ
        slovicka.add(new Slovicko("wine", "víno", R.drawable.jidlo_vino, R.raw.wine));
        slovicka.add(new Slovicko("coffee", "káva", R.drawable.jidlo_kava, R.raw.coffee));
        slovicka.add(new Slovicko("milk", "mléko", R.drawable.jidlo_mleko, R.raw.milk));
        slovicka.add(new Slovicko("tea", "čaj", R.drawable.jidlo_caj, R.raw.tea));
        slovicka.add(new Slovicko("beer", "pivo", R.drawable.jidlo_pivo, R.raw.beer));

        // SLADKÉ
        slovicka.add(new Slovicko("cookie", "sušenka", R.drawable.jidlo_susenka, R.raw.cookie));
        slovicka.add(new Slovicko("ice cream", "zmrzlina", R.drawable.jidlo_zmrzlina, R.raw.ice_cream));
        slovicka.add(new Slovicko("cake", "dort", R.drawable.jidlo_dort, R.raw.cake));
        slovicka.add(new Slovicko("donut", "kobliha", R.drawable.jidlo_kobliha, R.raw.donut));
        slovicka.add(new Slovicko("lollipop", "lízátko", R.drawable.jidlo_lizatko, R.raw.lollipop));
        slovicka.add(new Slovicko("chocolate", "čokoláda", R.drawable.jidlo_cokolada, R.raw.chocolate));
        slovicka.add(new Slovicko("candy", "bonbón", R.drawable.jidlo_bonbon, R.raw.candy));
        slovicka.add(new Slovicko("honey", "med", R.drawable.jidlo_med, R.raw.honey));
        // není výslovnost
        //slovicka.add(new Slovicko("birthday cake", "narozeninový dort", R.drawable.jidlo_narozeninovy_dort, R.raw.birthday_cake));
        slovicka.add(new Slovicko("pancake", "palačinka", R.drawable.jidlo_palacinka, R.raw.pancake));

        //OVOCE A ZELENINA
        slovicka.add(new Slovicko("potato", "brambora", R.drawable.jidlo_brambora, R.raw.potato));
        slovicka.add(new Slovicko("tomato", "rajče", R.drawable.jidlo_rajce, R.raw.tomato));
        slovicka.add(new Slovicko("apple", "jablko", R.drawable.jidlo_jablko, R.raw.apple));
        slovicka.add(new Slovicko("salad", "salát", R.drawable.jidlo_salat, R.raw.salad));
        slovicka.add(new Slovicko("banana", "banán", R.drawable.jidlo_banan, R.raw.banana));
        slovicka.add(new Slovicko("pear", "hruška", R.drawable.jidlo_hruska, R.raw.pear));
        slovicka.add(new Slovicko("strawberry", "jahoda", R.drawable.jidlo_jahoda, R.raw.strawberry));
        slovicka.add(new Slovicko("carrot", "mrkev", R.drawable.jidlo_mrkev, R.raw.carrot));
        slovicka.add(new Slovicko("grape", "hroznové víno", R.drawable.jidlo_hroznove_vino, R.raw.grape));
        slovicka.add(new Slovicko("corn", "kukuřice", R.drawable.jidlo_kukurice, R.raw.corn));
        slovicka.add(new Slovicko("peach", "broskev", R.drawable.jidlo_broskev, R.raw.peach));
        slovicka.add(new Slovicko("avocado", "avokádo", R.drawable.jidlo_avokado, R.raw.avocado));
        slovicka.add(new Slovicko("pepper", "paprika", R.drawable.jidlo_chilli_papricka, R.raw.pepper));
        slovicka.add(new Slovicko("sweet potato", "batát", R.drawable.jidlo_batat, R.raw.sweet_potato));
        slovicka.add(new Slovicko("cucumber", "okurka", R.drawable.jidlo_okurka, R.raw.cucumber));
        slovicka.add(new Slovicko("watermelon", "vodní meloun", R.drawable.jidlo_vodni_meloun, R.raw.watermelon));
        slovicka.add(new Slovicko("lemon", "citron", R.drawable.jidlo_citron, R.raw.lemon));


        // FAST FOOD
        slovicka.add(new Slovicko("french fries", "hranolky", R.drawable.jidlo_hranolky, R.raw.french_fries));
        slovicka.add(new Slovicko("pizza", "pizza", R.drawable.jidlo_pizza, R.raw.pizza));
        slovicka.add(new Slovicko("hotdog", "párek v rohlíku", R.drawable.jidlo_parek_v_rohliku, R.raw.hot_dog));


        // nerozřazené
        slovicka.add(new Slovicko("bread", "chleba", R.drawable.jidlo_chleba, R.raw.bread));
        slovicka.add(new Slovicko("meat", "maso", R.drawable.jidlo_maso, R.raw.meat));
        slovicka.add(new Slovicko("rice", "rýže", R.drawable.jidlo_ryze, R.raw.rice));
        slovicka.add(new Slovicko("pasta", "těstoviny", R.drawable.jidlo_testoviny, R.raw.pasta));

        slovicka.add(new Slovicko("cheese", "sýr", R.drawable.jidlo_syr, R.raw.cheese));
        slovicka.add(new Slovicko("peanut", "burák", R.drawable.jidlo_burak, R.raw.peanut));

        slovicka.add(new Slovicko("bacon", "slanina", R.drawable.jidlo_slanina, R.raw.bacon));
        slovicka.add(new Slovicko("omelette", "omeleta", R.drawable.jidlo_omeleta, R.raw.omelette));




        return slovicka;
    }
}
