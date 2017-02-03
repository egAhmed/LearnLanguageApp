package cz.ejstn.learnlanguageapp;

import org.junit.Test;

import cz.ejstn.learnlanguageapp.model.Slovicko;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


/**
 * Created by Martin Soukup on 3.2.2017.
 */

public class SlovickoTest {

    @Test
    public void testMetodyEquals () {
        Slovicko slovo1 = new Slovicko("dog", "swag", R.drawable.zvirata_pes, R.raw.song);
        Slovicko slovo2 = new Slovicko("dog", "hahaha", R.drawable.zvirata_beran, R.raw.song);

        boolean shodnost = slovo1.equals(slovo2);

        assertTrue(shodnost);


    }

    @Test
    public void testMetodyEqualsPrisnejsi () {
        Slovicko slovo1 = new Slovicko("dog", "rozdrcená moula", R.drawable.zvirata_kocka, R.raw.song);
        Slovicko slovo2 = new Slovicko("dog", "pes ty vole", R.drawable.zvirata_kun, R.raw.song);

        boolean shodnost = slovo1.equalsPrisnejsi(slovo2);

        assertFalse(shodnost);

    }
}
