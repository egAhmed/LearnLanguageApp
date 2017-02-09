package cz.ejstn.learnlanguageapp.aktivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.start.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //schovat actionbar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        } else {
            Intent i = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(i);
            finish();
        }

        ImageView splashObrazek = (ImageView) findViewById(R.id.splash_obrazek);

        final Animation splashAnimace = AnimationUtils.loadAnimation(this, R.anim.splash_animace_alfa_prechod);

        splashObrazek.startAnimation(splashAnimace);

        Thread vlakno = new Thread() {
            // run() říká co má vlákno dělat
            @Override
            public void run() {
                try {
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
