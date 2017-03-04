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
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(kontext);
        String barvaAplikace = sharedPreferences.getString(kontext.getString(R.string.nastaveni_barva_aplikace_klic)
                , kontext.getString(R.string.nastaveni_barva_aplikace_defaultni));

        switch (barvaAplikace) {
            case "modra":
                return R.style.ModreTema;
            case "cervena":
                return R.style.ModreTema;
            case "zelena":
                return R.style.ModreTema;
            default:
                return R.style.ModreTema;
        }
    }


}
