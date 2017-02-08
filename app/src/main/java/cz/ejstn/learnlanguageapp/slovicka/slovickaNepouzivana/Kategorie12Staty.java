package cz.ejstn.learnlanguageapp.slovicka.slovickaNepouzivana;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 1.2.2017.
 */

public final class Kategorie12Staty {

    private Kategorie12Staty() {

    }


    public static ArrayList<Slovicko> pripravKategorii() {
        ArrayList<Slovicko> slovicka = new ArrayList<>();


        vytvorSlovicka(slovicka);

        return slovicka;
    }


    // státy
    private static ArrayList<Slovicko> vytvorSlovicka(ArrayList<Slovicko> slovicka) {

        // není obrázek
        //  slovicka.add(new Slovicko("Cuba", "Kuba", R.drawable.staty_kuba, R.raw.song));
        //  slovicka.add(new Slovicko("the Dominican Republic", "Dominikánská republika", R.drawable.staty_dominikanska_republika, R.raw.song));
        //   slovicka.add(new Slovicko("Belize", "Belize", R.drawable.staty_belize, R.raw.song));
        //  slovicka.add(new Slovicko("Costa Rica", "Kostarika", R.drawable.staty_kostarika, R.raw.song));
        //  slovicka.add(new Slovicko("Angola", "Angola", R.drawable.staty_angola, R.raw.song));
        //   slovicka.add(new Slovicko("Cameroon", "Kamerun", R.drawable.staty_kamerun, R.raw.song));
        //  slovicka.add(new Slovicko("Ethiopia", "Etiopie", R.drawable.staty_etiopie, R.raw.song));
        //   slovicka.add(new Slovicko("Botswana", "Botswana", R.drawable.staty_botswana, R.raw.song));
        // slovicka.add(new Slovicko("South Korea", "Jižní Korea",R.drawable.staty_jizni_korea, R.raw.song));

        // EVROPA

        slovicka.add(new Slovicko("Czech Republic", "Česká republika", R.drawable.staty_ceska_republika, R.raw.song));
        slovicka.add(new Slovicko("Slovakia", "Slovensko", R.drawable.staty_slovensko, R.raw.song));
        slovicka.add(new Slovicko("Poland", "Polsko", R.drawable.staty_polsko, R.raw.song));
        slovicka.add(new Slovicko("Austria", "Rakousko", R.drawable.staty_rakousko, R.raw.song));
        slovicka.add(new Slovicko("Germany", "Německo", R.drawable.staty_nemecko, R.raw.song));
        slovicka.add(new Slovicko("Great Britain", "Velká Británie", R.drawable.staty_velka_britanie, R.raw.song));
        slovicka.add(new Slovicko("France", "Francie", R.drawable.staty_francie, R.raw.song));

        slovicka.add(new Slovicko("Ireland", "Irsko", R.drawable.staty_irsko, R.raw.song));
        slovicka.add(new Slovicko("Romania", "Rumunsko", R.drawable.staty_rumunsko, R.raw.song));
        slovicka.add(new Slovicko("Spain", "Španělsko", R.drawable.staty_spanelsko, R.raw.song));

        slovicka.add(new Slovicko("Italy", "Itálie", R.drawable.staty_italie, R.raw.song));
        slovicka.add(new Slovicko("Greece", "Řecko", R.drawable.staty_recko, R.raw.song));
        slovicka.add(new Slovicko("Turkey", "Turecko", R.drawable.staty_turecko, R.raw.song));
        slovicka.add(new Slovicko("Ukraine", "Ukrajina", R.drawable.staty_ukrajina, R.raw.song));

        slovicka.add(new Slovicko("Switzerland", "Švýcarsko", R.drawable.staty_svycarsko, R.raw.song));
        slovicka.add(new Slovicko("Bulgaria", "Bulharsko", R.drawable.staty_bulharsko, R.raw.song));

        slovicka.add(new Slovicko("Norway", "Norsko", R.drawable.staty_norsko, R.raw.song));
        slovicka.add(new Slovicko("Denmark", "Dánsko", R.drawable.staty_dansko, R.raw.song));
        slovicka.add(new Slovicko("Finland", "Finsko", R.drawable.staty_finsko, R.raw.song));
        slovicka.add(new Slovicko("Belgium", "Belgie", R.drawable.staty_belgie, R.raw.song));

        slovicka.add(new Slovicko("Netherlands", "Nizozemsko", R.drawable.staty_nizozemsko, R.raw.song));
        slovicka.add(new Slovicko("Hungary", "Maďarsko", R.drawable.staty_madarsko, R.raw.song));
        slovicka.add(new Slovicko("Sweden", "Švédsko", R.drawable.staty_svedsko, R.raw.song));

        //ASIE
        slovicka.add(new Slovicko("Russian", "Rusko", R.drawable.staty_rusko, R.raw.song));
        slovicka.add(new Slovicko("China", "Čína", R.drawable.staty_cina, R.raw.song));
        slovicka.add(new Slovicko("Japan", "Japonskko", R.drawable.staty_japonsko, R.raw.song));
        slovicka.add(new Slovicko("India", "Indie", R.drawable.staty_indie, R.raw.song));

        slovicka.add(new Slovicko("North Korea", "Severní Korea", R.drawable.staty_severni_korea, R.raw.song));
        slovicka.add(new Slovicko("Thailand", "Thajsko", R.drawable.staty_thajsko, R.raw.song));
        slovicka.add(new Slovicko("Vietnam", "Vietnam", R.drawable.staty_vietnam, R.raw.song));

        slovicka.add(new Slovicko("Syria", "Sýrie", R.drawable.staty_syrie, R.raw.song));
        slovicka.add(new Slovicko("Iraq", "Irák", R.drawable.staty_irak, R.raw.song));
        slovicka.add(new Slovicko("Israel", "Izrael", R.drawable.staty_izrael, R.raw.song));
        slovicka.add(new Slovicko("Lebanon", "Libanon", R.drawable.staty_libanon, R.raw.song));

        slovicka.add(new Slovicko("Saudi Arabia", "Saudská Arábie", R.drawable.staty_saudska_arabie, R.raw.song));
        slovicka.add(new Slovicko("United Arab Emirates", "Spojené Arabské Emiráty", R.drawable.staty_spojene_arabske_emiraty, R.raw.song));
        slovicka.add(new Slovicko("Oman", "Omán", R.drawable.staty_oman, R.raw.song));
        slovicka.add(new Slovicko("Yemen", "Jemen", R.drawable.staty_jemen, R.raw.song));

        slovicka.add(new Slovicko("Afghanistan", "Afgánistán", R.drawable.staty_afganistan, R.raw.song));
        slovicka.add(new Slovicko("Pakistan", "Pakistán", R.drawable.staty_pakistan, R.raw.song));
        slovicka.add(new Slovicko("Iran", "Irán", R.drawable.staty_iran, R.raw.song));
        slovicka.add(new Slovicko("Georgia", "Gruzie", R.drawable.staty_gruzie, R.raw.song));


        //AFRIKA

        slovicka.add(new Slovicko("Egypt", "Egypt", R.drawable.staty_egypt, R.raw.song));
        slovicka.add(new Slovicko("Tunisia", "Tunis", R.drawable.staty_tunisko, R.raw.song));
        slovicka.add(new Slovicko("Morocco", "Maroko", R.drawable.staty_maroko, R.raw.song));
        slovicka.add(new Slovicko("Libya", "Libie", R.drawable.staty_libie, R.raw.song));

        slovicka.add(new Slovicko("Chad", "Čad", R.drawable.staty_cad, R.raw.song));
        slovicka.add(new Slovicko("Niger", "Niger", R.drawable.staty_niger, R.raw.song));
        slovicka.add(new Slovicko("Sudan", "Súdán", R.drawable.staty_sudan, R.raw.song));

        slovicka.add(new Slovicko("Kenya", "Keňa", R.drawable.staty_kena, R.raw.song));
        slovicka.add(new Slovicko("Somalia", "Somálsko", R.drawable.staty_somalsko, R.raw.song));
        slovicka.add(new Slovicko("Nigeria", "Nigérie", R.drawable.staty_nigerie, R.raw.song));

        slovicka.add(new Slovicko("Zambia", "Zambie", R.drawable.staty_zambie, R.raw.song));
        slovicka.add(new Slovicko("Mozambique", "Mosambik", R.drawable.staty_mozambik, R.raw.song));
        slovicka.add(new Slovicko("Zimbabwe", "Zimbabwe", R.drawable.staty_zimbabwe, R.raw.song));

        slovicka.add(new Slovicko("Namibia", "Namibie", R.drawable.staty_namibie, R.raw.song));
        slovicka.add(new Slovicko("Swaziland", "Svazijsko", R.drawable.staty_svazijsko, R.raw.song));
        slovicka.add(new Slovicko("South Africa", "Jižní Afrika", R.drawable.staty_jizni_afrika, R.raw.song));


        // SEVERNÍ AMERIKA
        slovicka.add(new Slovicko("Mexico", "Mexiko", R.drawable.staty_mexiko, R.raw.song));
        slovicka.add(new Slovicko("USA", "Spojené Státy Americké", R.drawable.staty_spojene_staty_americke, R.raw.song));
        slovicka.add(new Slovicko("Canada", "Kanada", R.drawable.staty_kanada, R.raw.song));


        // JIŽNÍ AMERIKA

        slovicka.add(new Slovicko("Colombia", "Kolumbie", R.drawable.staty_kolumbie, R.raw.song));
        slovicka.add(new Slovicko("Venezuela", "Venezuela", R.drawable.staty_venezuela, R.raw.song));
        slovicka.add(new Slovicko("Brasil", "Brazílie", R.drawable.staty_brazilie, R.raw.song));
        slovicka.add(new Slovicko("Peru", "Peru", R.drawable.staty_peru, R.raw.song));

        slovicka.add(new Slovicko("Bolivia", "Bolívie", R.drawable.staty_bolivie, R.raw.song));
        slovicka.add(new Slovicko("Chile", "Chile", R.drawable.staty_chile, R.raw.song));
        slovicka.add(new Slovicko("Paraguay", "Paraguaj", R.drawable.staty_paraguay, R.raw.song));
        slovicka.add(new Slovicko("Argentina", "Argentina", R.drawable.staty_argentina, R.raw.song));

        slovicka.add(new Slovicko("Guatemala", "Guatemala", R.drawable.staty_guatemala, R.raw.song));

        // AUSTRÁLIE A OCEÁNIE

        slovicka.add(new Slovicko("Australia", "Austrálie", R.drawable.staty_australie, R.raw.song));
        slovicka.add(new Slovicko("New Zealand", "Nový Zéland", R.drawable.staty_novy_zeland, R.raw.song));


        return slovicka;
    }

}
