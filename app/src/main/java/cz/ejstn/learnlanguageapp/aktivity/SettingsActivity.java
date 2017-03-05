package cz.ejstn.learnlanguageapp.aktivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.helper.BarvaAplikaceHelper;

public class SettingsActivity extends AppCompatActivity {

    public static final String TAG = SettingsActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        vyresBarvuAppAStatusBaru();
        setContentView(R.layout.activity_settings);
    }

    public static class MujPreferenceFragment extends PreferenceFragment implements Preference.OnPreferenceChangeListener {

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings);

            Preference barvaAplikace = findPreference(getString(R.string.nastaveni_barva_aplikace_klic));
            barvaAplikace.setOnPreferenceChangeListener(this);

        }

        @Override
        public boolean onPreferenceChange(Preference preference, Object newValue) {

            if (preference.getKey().equals(getString(R.string.nastaveni_barva_aplikace_klic))) {

                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity().getApplicationContext());
                String aktualniBarva = sharedPreferences.getString(getActivity().getApplicationContext().getString(R.string.nastaveni_barva_aplikace_klic)
                        , getActivity().getApplicationContext().getString(R.string.nastaveni_barva_aplikace_defaultni));
                String zvolenaBarva = String.valueOf(newValue);

                if (!aktualniBarva.equals(zvolenaBarva)) {

                    Log.i(TAG, "onPreferenceChange: podařilo se");
                    Intent i = getActivity().getPackageManager()
                            .getLaunchIntentForPackage(getActivity().getPackageName());
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                    getActivity().setResult(0);
                    getActivity().finish();
                }


            }
            return true;
        }
    }

    private void vyresBarvuAppAStatusBaru() {
        getTheme().applyStyle(BarvaAplikaceHelper.zjistiStylAplikace(this), true);
    }
}
