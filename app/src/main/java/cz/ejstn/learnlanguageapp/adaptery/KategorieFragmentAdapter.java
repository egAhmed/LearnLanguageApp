package cz.ejstn.learnlanguageapp.adaptery;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.fragmenty.KategorieUniverzalniFragment;

/**
 * Created by Martin Soukup on 4.2.2017.
 */

public class KategorieFragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public KategorieFragmentAdapter(FragmentManager fm, Context mContext) {
        super(fm);
        this.mContext = mContext;
    }


    // počet tabů
    @Override
    public int getCount() {
        return 10;
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
                Bundle args = new Bundle();
                args.putString("jmenoKategorie", "Zvirata");
                KategorieUniverzalniFragment fragment = new KategorieUniverzalniFragment();
                fragment.setArguments(args);

                return fragment;
            case 1:
                Bundle args1 = new Bundle();
                args1.putString("jmenoKategorie", "Rodina");
                KategorieUniverzalniFragment fragment1 = new KategorieUniverzalniFragment();
                fragment1.setArguments(args1);

                return fragment1;
            case 2:
                Bundle args2 = new Bundle();
                args2.putString("jmenoKategorie", "JidloAPiti");
                KategorieUniverzalniFragment fragment2 = new KategorieUniverzalniFragment();
                fragment2.setArguments(args2);

                return fragment2;
            case 3:
                Bundle args3 = new Bundle();
                args3.putString("jmenoKategorie", "OsobnostANalada");
                KategorieUniverzalniFragment fragment3 = new KategorieUniverzalniFragment();
                fragment3.setArguments(args3);

                return fragment3;
            case 4:
                Bundle args4 = new Bundle();
                args4.putString("jmenoKategorie", "Barvy");
                KategorieUniverzalniFragment fragment4 = new KategorieUniverzalniFragment();
                fragment4.setArguments(args4);

                return fragment4;
            case 5:
                Bundle args5 = new Bundle();
                args5.putString("jmenoKategorie", "VolnyCas");
                KategorieUniverzalniFragment fragment5 = new KategorieUniverzalniFragment();
                fragment5.setArguments(args5);

                return fragment5;
            case 6:
                Bundle args6 = new Bundle();
                args6.putString("jmenoKategorie", "Sport");
                KategorieUniverzalniFragment fragment6 = new KategorieUniverzalniFragment();
                fragment6.setArguments(args6);

                return fragment6;
            case 7:
                Bundle args7 = new Bundle();
                args7.putString("jmenoKategorie", "PrirodaAPocasi");
                KategorieUniverzalniFragment fragment7 = new KategorieUniverzalniFragment();
                fragment7.setArguments(args7);

                return fragment7;
            case 8:
                Bundle args8 = new Bundle();
                args8.putString("jmenoKategorie", "Cisla");
                KategorieUniverzalniFragment fragment8 = new KategorieUniverzalniFragment();
                fragment8.setArguments(args8);

                return fragment8;
            case 9:
                Bundle args9 = new Bundle();
                args9.putString("jmenoKategorie", "Doprava");
                KategorieUniverzalniFragment fragment9 = new KategorieUniverzalniFragment();
                fragment9.setArguments(args9);

                return fragment9;

            default:
                return null;
        }
    }



    /* starý systém getItemu
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
    } */



}