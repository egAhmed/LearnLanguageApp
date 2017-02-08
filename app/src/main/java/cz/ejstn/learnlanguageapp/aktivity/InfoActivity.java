package cz.ejstn.learnlanguageapp.aktivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.helper.InfoHelper;


public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        nastavTextVerzeAPocetSlovicek();
    }

    private void nastavTextVerzeAPocetSlovicek() {
        TextView infoTextVerze = (TextView) findViewById(R.id.info_text3);
        TextView infoTextPocetSlovice = (TextView) findViewById(R.id.info_text2);


        infoTextPocetSlovice.setText(getText(R.string.textInfo3)
                + " " + Integer.toString(InfoHelper.spocitejVsechnaSlovickaVAplikaci())
                + " slovíček");

        infoTextVerze.setText(getText(R.string.textInfo2)
                + " " + InfoHelper.zjistiJmenoVerze(this));
    }

}


