package cz.ejstn.learnlanguageapp.aktivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import cz.ejstn.learnlanguageapp.R;

public class SettingsActivity extends AppCompatActivity {

    public static final String TAG = SettingsActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  getTheme().applyStyle(BarvaAplikaceHelper.zjistiStylAplikace(this), true);
        setContentView(R.layout.activity_settings);
    }

    public static class EarthquakePreferenceFragment extends PreferenceFragment
            implements Preference.OnPreferenceChangeListener{

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
                Log.i(TAG, "onPreferenceChange: podařilo se");
                Intent i = getActivity().getPackageManager()
                        .getLaunchIntentForPackage( getActivity().getPackageName() );
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);


            }
            return true;
        }


    }
}
