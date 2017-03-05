package cz.ejstn.learnlanguageapp.helper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import cz.ejstn.learnlanguageapp.R;

/**
 * Created by Martin Soukup on 4.3.2017.
 */

public final class BarvaAplikaceHelper {

    private BarvaAplikaceHelper() {

    }

    public static int zjistiStylAplikace(Context kontext) {

        switch (zjistiAktualniBarvuAplikace(kontext)) {
            case "modra":
                return R.style.ModreTema;
            case "cervena":
                return R.style.CerveneTema;
            case "zelena":
                return R.style.ZeleneTema;
            case "oranzova":
                return R.style.OranzoveTema;
            case "fialova":
                return R.style.FialoveTema;
            default:
                return R.style.ZeleneTema;
        }
    }

    public static int zjistiPrimarniBarvu(Context kontext) {

        switch (zjistiAktualniBarvuAplikace(kontext)) {
            case "modra":
                return R.color.modra;
            case "cervena":
                return R.color.cervena;
            case "zelena":
                return R.color.colorPrimary;
            case "oranzova":
                return R.color.oranzova;
            case "fialova":
                return R.color.fialova;
            default:
                return R.color.colorPrimary;
        }
    }

    public static int zjistiSekundarniBarvu(Context kontext) {

        switch (zjistiAktualniBarvuAplikace(kontext)) {
            case "modra":
                return R.color.tmaveModra;
            case "cervena":
                return R.color.tmaveCervena;
            case "zelena":
                return R.color.colorPrimaryDark;
            case "oranzova":
                return R.color.tmaveOranzova;
            case "fialova":
                return R.color.tmaveFialova;
            default:
                return R.color.colorPrimary;
        }
    }

    private static String zjistiAktualniBarvuAplikace(Context kontext) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(kontext);
        return sharedPreferences.getString(kontext.getString(R.string.nastaveni_barva_aplikace_klic)
                , kontext.getString(R.string.nastaveni_barva_aplikace_defaultni));
    }


}
