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
        slovicka.add(new Slovicko("watching tv", "sledování televize", R.drawable.volnycas_sledovat_tv, R.raw.song));
        slovicka.add(new Slovicko("go for a walk", "jít na procházku", R.drawable.volnycas_jit_na_prochazku, R.raw.song));
        slovicka.add(new Slovicko("play video games", "hrát videohry", R.drawable.volnycas_hrat_videohry, R.raw.song));
        slovicka.add(new Slovicko("gardening", "zahradničení", R.drawable.volnycas_zahradniceni, R.raw.song));
        slovicka.add(new Slovicko("excercising", "cvičení", R.drawable.volnycas_cviceni, R.raw.song));
        slovicka.add(new Slovicko("cooking", "vaření", R.drawable.volnycas_vareni, R.raw.song));
        slovicka.add(new Slovicko("shopping", "nakupování", R.drawable.volnycas_nakupovat, R.raw.song));
        slovicka.add(new Slovicko("surf the internet", "brouzdat na internetu", R.drawable.volnycas_brouzdani, R.raw.song));

        slovicka.add(new Slovicko("fishing", "rybaření", R.drawable.volnycas_rybareni, R.raw.song));
        slovicka.add(new Slovicko("singing", "zpívání", R.drawable.volnycas_zpivani, R.raw.song));
        slovicka.add(new Slovicko("board games", "deskové hry", R.drawable.volnycas_deskove_hry, R.raw.song));
        slovicka.add(new Slovicko("painting", "malování", R.drawable.volnycas_malovani, R.raw.song));
        slovicka.add(new Slovicko("travelling", "cestování", R.drawable.volnycas_cestovani, R.raw.song));
        slovicka.add(new Slovicko("photography", "focení", R.drawable.volnycas_foceni, R.raw.song));
        slovicka.add(new Slovicko("writing", "psaní", R.drawable.volnycas_psani, R.raw.song));
        slovicka.add(new Slovicko("photography", "focení", R.drawable.volnycas_foceni, R.raw.song));
        slovicka.add(new Slovicko("sleeping", "spaní", R.drawable.volnycas_spani, R.raw.song));

        slovicka.add(new Slovicko("juggling", "žonglování", R.drawable.volnycas_zonglovani, R.raw.song));
        slovicka.add(new Slovicko("taking selfies", "focení selfies", R.drawable.volnycas_foceni_selfies, R.raw.song));
        slovicka.add(new Slovicko("dancing", "tanec", R.drawable.volnycas_tanec, R.raw.song));

        slovicka.add(new Slovicko("go to movies", "jít do kina", R.drawable.volnycas_jit_do_kina, R.raw.song));
        slovicka.add(new Slovicko("read newspaper", "číst noviny", R.drawable.volnycas_cist_noviny, R.raw.song));
        slovicka.add(new Slovicko("listen to radio", "poslouchat rádio", R.drawable.volnycas_poslouchat_radio, R.raw.song));

        slovicka.add(new Slovicko("play cards", "hrát karty", R.drawable.volnycas_hrat_karty, R.raw.song));
      //slovicka.add(new Slovicko("taking selfies", "focení selfies", R.drawable.volnycas_foceni_selfies, R.raw.song));
      //slovicka.add(new Slovicko("dancing", "tanec", R.drawable.volnycas_tanec, R.raw.song));


        return slovicka;
    }
}
