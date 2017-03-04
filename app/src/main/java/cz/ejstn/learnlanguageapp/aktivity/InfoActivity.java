package cz.ejstn.learnlanguageapp.aktivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.helper.InfoHelper;
import cz.ejstn.learnlanguageapp.helper.ObrazekHelper;


public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   getTheme().applyStyle(BarvaAplikaceHelper.zjistiStylAplikace(this), true);
        setContentView(R.layout.activity_info);


        nastavTextVerzeAPocetSlovicek();

        pripravObrazekZvirete();
    }

    private void nastavTextVerzeAPocetSlovicek() {
        TextView infoTextKecy = (TextView) findViewById(R.id.info_text1);
        TextView infoTextVerze = (TextView) findViewById(R.id.info_text3);
        TextView infoTextPocetSlovice = (TextView) findViewById(R.id.info_text2);

        infoTextKecy.setText(getText(R.string.textInfo1) + " " + InfoHelper.vygenerujKecyDoInfoAktivity());


        infoTextPocetSlovice.setText(getText(R.string.textInfo3)
                + " " + Integer.toString(InfoHelper.spocitejVsechnaSlovickaVAplikaci())
                + " slovíček");

        infoTextVerze.setText(getText(R.string.textInfo2)
                + " " + InfoHelper.zjistiJmenoVerze(this));
    }


    private void pripravObrazekZvirete() {
        ImageView obrazekZvirete = (ImageView) findViewById(R.id.obrazek_zvirete_info_aktivita);

        obrazekZvirete.setImageResource(ObrazekHelper.vygenerujObrazekZvirete());
    }

}