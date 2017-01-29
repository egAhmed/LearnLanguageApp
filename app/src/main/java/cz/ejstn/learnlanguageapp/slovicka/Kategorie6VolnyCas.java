package cz.ejstn.learnlanguageapp.slovicka;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class Kategorie6VolnyCas {

    private Kategorie6VolnyCas() {
    }

    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }

    // volný čas
    private static ArrayList<Slovicko> vytvorSlovicka (ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("reading", "čtení", R.drawable.volnycas_cteni, R.raw.song));
        slovicka.add(new Slovicko("listen to music", "poslouchat hudbu",R.drawable.volnycas_poslouchani_muziky, R.raw.song));
        slovicka.add(new Slovicko("watch tv", "sledovat televizi", R.drawable.volnycas_sledovat_tv, R.raw.song));
        slovicka.add(new Slovicko("go for a walk", "jít na procházku", R.drawable.volnycas_jit_na_prochazku, R.raw.song));
        slovicka.add(new Slovicko("play video games", "hrát videohry", R.drawable.volnycas_hrat_videohry, R.raw.song));
        slovicka.add(new Slovicko("gardening", "zahradničení", R.drawable.volnycas_zahradniceni, R.raw.song));
        slovicka.add(new Slovicko("excercising", "cvičení", R.drawable.volnycas_cviceni, R.raw.song));
        slovicka.add(new Slovicko("cooking", "vaření", R.drawable.volnycas_vareni, R.raw.song));
        slovicka.add(new Slovicko("shopping", "nakupování", R.drawable.volnycas_nakupovat, R.raw.song));
        slovicka.add(new Slovicko("surf the internet", "brouzdat na internetu", R.drawable.volnycas_brouzdani, R.raw.song));


        return slovicka;
    }
}
