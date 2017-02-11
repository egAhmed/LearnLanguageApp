package cz.ejstn.learnlanguageapp;

import org.junit.Test;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.helper.NavigationFunFactHelper;
import cz.ejstn.learnlanguageapp.model.FunFact;

import static junit.framework.Assert.assertFalse;

/**
 * Created by Martin Soukup on 8.2.2017.
 */

public class NavigationFunFactHelperTest {

    @Test
    public void funFactDuplicita() {
        ArrayList<FunFact> listFunFactu = NavigationFunFactHelper.getSeznamFunFaktu();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < listFunFactu.size(); i++) {
            for (int j = 0; j < listFunFactu.size(); j++) {
                if (i == j) {
                    continue;
                }

                if (listFunFactu.get(i).equalsPodleObrazkuAAnglictiny(listFunFactu.get(j))) {
                    obsahujeDuplicitu = true;
                    System.out.println(listFunFactu.get(i));
                }


            }
        }

        assertFalse(obsahujeDuplicitu);

    }
}
