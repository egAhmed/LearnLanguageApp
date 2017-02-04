package cz.ejstn.learnlanguageapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cz.ejstn.learnlanguageapp.fragmenty.Kategorie10Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie1Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie2Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie3Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie4Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie5Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie6Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie7Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie8Fragment;
import cz.ejstn.learnlanguageapp.fragmenty.Kategorie9Fragment;

/**
 * Created by Martin Soukup on 4.2.2017.
 */

public class KategorieFragmentPagerAdapter extends FragmentPagerAdapter {


    public KategorieFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    // který tab bude na kterém místě
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Kategorie1Fragment();
            case 1:
                return new Kategorie2Fragment();
            case 2:
                return new Kategorie3Fragment();
            case 3:
                return new Kategorie4Fragment();
            case 4:
                return new Kategorie5Fragment();
            case 5:
                return new Kategorie6Fragment();
            case 6:
                return new Kategorie7Fragment();
            case 7:
                return new Kategorie8Fragment();
            case 8:
                return new Kategorie9Fragment();
            case 9:
                return new Kategorie10Fragment();
            default:
                return null;
        }
    }


    // počet tabů
    @Override
    public int getCount() {
        return 10;
    }
}
