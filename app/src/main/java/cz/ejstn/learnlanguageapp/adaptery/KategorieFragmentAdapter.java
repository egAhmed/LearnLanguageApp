package cz.ejstn.learnlanguageapp.adaptery;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cz.ejstn.learnlanguageapp.R;
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

public class KategorieFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public KategorieFragmentAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0:
                return mContext.getString(R.string.menu_item_1);
            case 1:
                return mContext.getString(R.string.menu_item_2);
            case 2:
                return mContext.getString(R.string.menu_item_3);
            case 3:
                return mContext.getString(R.string.menu_item_4);
            case 4:
                return mContext.getString(R.string.menu_item_5);
            case 5:
                return mContext.getString(R.string.menu_item_6);
            case 6:
                return mContext.getString(R.string.menu_item_7);
            case 7:
                return mContext.getString(R.string.menu_item_8);
            case 8:
                return mContext.getString(R.string.menu_item_9);
            case 9:
                return mContext.getString(R.string.menu_item_10);
            default:
                return null;
        }

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