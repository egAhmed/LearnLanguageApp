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
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {
        slovicka.add(new Slovicko("reading", "čtení", R.drawable.volnycas_cteni, R.raw.reading));
        slovicka.add(new Slovicko("gardening", "zahradničení", R.drawable.volnycas_zahradniceni, R.raw.gardening));
        slovicka.add(new Slovicko("cooking", "vaření", R.drawable.volnycas_vareni, R.raw.cooking));
        slovicka.add(new Slovicko("shopping", "nakupování", R.drawable.volnycas_nakupovat, R.raw.shopping));

        slovicka.add(new Slovicko("fishing", "rybaření", R.drawable.volnycas_rybareni, R.raw.fishing));
        slovicka.add(new Slovicko("singing", "zpívání", R.drawable.volnycas_zpivani, R.raw.singing));
        slovicka.add(new Slovicko("painting", "malování", R.drawable.volnycas_malovani, R.raw.painting));
        slovicka.add(new Slovicko("traveling", "cestování", R.drawable.volnycas_cestovani, R.raw.traveling));
        slovicka.add(new Slovicko("writing", "psaní", R.drawable.volnycas_psani, R.raw.writing));
        slovicka.add(new Slovicko("photography", "focení", R.drawable.volnycas_foceni, R.raw.photography));
        slovicka.add(new Slovicko("sleeping", "spaní", R.drawable.volnycas_spani, R.raw.sleeping));

        slovicka.add(new Slovicko("juggling", "žonglování", R.drawable.volnycas_zonglovani, R.raw.juggling));
        slovicka.add(new Slovicko("dancing", "tanec", R.drawable.volnycas_tanec, R.raw.dancing));


            /* chybějící výslovnost
        slovicka.add(new Slovicko("taking selfies", "focení selfies", R.drawable.volnycas_foceni_selfies, R.raw.taking_selfies));
        slovicka.add(new Slovicko("listening to radio", "poslouchání rádia", R.drawable.volnycas_poslouchat_radio, R.raw.listening_to_radio));
        slovicka.add(new Slovicko("going to movies", "chození do kina", R.drawable.volnycas_jit_do_kina, R.raw.going_to_movies));
        slovicka.add(new Slovicko("reading newspaper", "četní noviny", R.drawable.volnycas_cist_noviny, R.raw.reading_newspaper));
        slovicka.add(new Slovicko("playing video games", "hraní videoher", R.drawable.volnycas_hrat_videohry, R.raw.playing_video_games));
        slovicka.add(new Slovicko("exercising", "cvičení", R.drawable.volnycas_cviceni, R.raw.exercising));
        slovicka.add(new Slovicko("board games", "deskové hry", R.drawable.volnycas_deskove_hry, R.raw.board_games));
        slovicka.add(new Slovicko("playing cards", "hraní karet", R.drawable.volnycas_hrat_karty, R.raw.playing_cards));
        slovicka.add(new Slovicko("watching tv", "sledování televize", R.drawable.volnycas_sledovat_tv, R.raw.watching_tv));
        slovicka.add(new Slovicko("surfing the internet", "brouzdání na internetu", R.drawable.volnycas_brouzdani, R.raw.surfing_the_internet));
        slovicka.add(new Slovicko("going for a walk", "chození na procházky", R.drawable.volnycas_jit_na_prochazku, R.raw.going_for_a_walk));
        slovicka.add(new Slovicko("listening to music", "poslouchání hudby", R.drawable.volnycas_poslouchani_muziky, R.raw.listening_to_music));
            */

        return slovicka;
    }
}
