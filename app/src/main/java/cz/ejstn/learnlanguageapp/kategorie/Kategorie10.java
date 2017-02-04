package cz.ejstn.learnlanguageapp.kategorie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie10Fragment;

public class Kategorie10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Kategorie10Fragment())
                .commit();
    }
}