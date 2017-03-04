package cz.ejstn.learnlanguageapp.aktivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.helper.InfoHelper;
import cz.ejstn.learnlanguageapp.start.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     //   getTheme().applyStyle(BarvaAplikaceHelper.zjistiStylAplikace(this), true);



       setContentView(R.layout.activity_splash);
       /* RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_splash);
        relativeLayout.setBackgroundResource(R.color.modra); */


        //schovat actionbar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        } else {
            Intent i = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }

        TextView verzeText = (TextView) findViewById(R.id.splash_text_jmeno_verze);
        verzeText.setText(InfoHelper.zjistiJmenoVerze(this));

        ImageView splashObrazek = (ImageView) findViewById(R.id.splash_obrazek);

        final Animation splashAnimace = AnimationUtils.loadAnimation(this, R.anim.splash_animace_alfa_prechod);

        splashObrazek.startAnimation(splashAnimace);
        verzeText.startAnimation(splashAnimace);

        Thread vlakno = new Thread() {
            // run() říká co má vlákno dělat
            @Override
            public void run() {
                try {
                    // čekat po délku animace
                    sleep(splashAnimace.getDuration());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // to co se zavolá v každém případě
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                    // aby se z MainActivity nedalo vrátit do SplashActivity
                    finish();
                }
            }
        };

        // pouštím vlákno
        vlakno.start();

    }
}
