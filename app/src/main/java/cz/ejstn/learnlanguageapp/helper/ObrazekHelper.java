package cz.ejstn.learnlanguageapp.helper;

import cz.ejstn.learnlanguageapp.R;

/**
 * Created by Martin Soukup on 9.2.2017.
 */

public final class ObrazekHelper {

    private static final int[] SEZNAM_OBRAZKU_ZVIRATA = new int[] {
            R.drawable.zvirata_koala,  R.drawable.zvirata_panda, R.drawable.zvirata_pes,
            R.drawable.zvirata_kocka,  R.drawable.zvirata_vlk,  R.drawable.zvirata_tucnak,
            R.drawable.zvirata_opice,  R.drawable.zvirata_kralik,  R.drawable.zvirata_jelen,
            R.drawable.zvirata_mys,  R.drawable.zvirata_liska,  R.drawable.zvirata_lev,
            R.drawable.zvirata_krecek,  R.drawable.zvirata_kun,  R.drawable.zvirata_medved,
            R.drawable.zvirata_vlk
    };

    private ObrazekHelper() {

    }

    public static int vygenerujObrazekZvirete() {
        int nahodny = (int) (Math.random() * SEZNAM_OBRAZKU_ZVIRATA.length);
        return SEZNAM_OBRAZKU_ZVIRATA[nahodny];
    }
}
