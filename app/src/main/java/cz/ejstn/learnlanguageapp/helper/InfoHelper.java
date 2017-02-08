package cz.ejstn.learnlanguageapp.helper;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.slovicka.Kategorie10Doprava;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie1Zvirata;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie2Rodina;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie3JidloAPiti;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie4Cisla;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie5Barvy;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie6VolnyCas;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie7Sport;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie8Priroda;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie9Osobnost;
import cz.ejstn.learnlanguageapp.slovicka.slovickaNepouzivana.Kategorie11Bydleni;
import cz.ejstn.learnlanguageapp.slovicka.slovickaNepouzivana.Kategorie12Staty;

/**
 * Created by Martin Soukup on 8.2.2017.
 */

public final class InfoHelper {

    private InfoHelper() {
    }

    public static int spocitejVsechnaSlovickaVAplikaci() {
        // stejný kód jako v testu pro zjistění celkových slovíček
        ArrayList pole[] = new ArrayList[]{
                Kategorie1Zvirata.pripravKategorii(), Kategorie2Rodina.pripravKategorii(),
                Kategorie3JidloAPiti.pripravKategorii(), Kategorie4Cisla.pripravKategorii(),
                Kategorie5Barvy.pripravKategorii(), Kategorie6VolnyCas.pripravKategorii(),
                Kategorie7Sport.pripravKategorii(), Kategorie8Priroda.pripravKategorii(),
                Kategorie9Osobnost.pripravKategorii(), Kategorie10Doprava.pripravKategorii(),
                Kategorie11Bydleni.pripravKategorii(), Kategorie12Staty.pripravKategorii()};

        int pocetSlovicek = 0;

        for (ArrayList list : pole) {
            pocetSlovicek += list.size();
        }

        return pocetSlovicek;
    }

    public static String zjistiJmenoVerze(Context kontext) {
        String jmenoVerze;

        try {
            PackageInfo packageInfo = kontext.getPackageManager().getPackageInfo(kontext.getPackageName(), 0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "Chyba";
        }


    }

}
