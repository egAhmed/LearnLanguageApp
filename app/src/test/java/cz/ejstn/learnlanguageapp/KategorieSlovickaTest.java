package cz.ejstn.learnlanguageapp;

import org.junit.Test;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.model.Slovicko;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie10Doprava;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie1Zvirata;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie2Rodina;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie3JidloAPiti;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie4Cisla;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie5Barvy;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie6VolnyCas;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie7Sport;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie8Priroda;
import cz.ejstn.learnlanguageapp.slovicka.Kategorie9Osobnost;
import cz.ejstn.learnlanguageapp.slovicka.slovickaNepouzivana.Kategorie11Bydleni;
import cz.ejstn.learnlanguageapp.slovicka.slovickaNepouzivana.Kategorie12Staty;

import static junit.framework.Assert.assertFalse;

/**
 * Created by Martin Soukup on 3.2.2017.
 */

public class KategorieSlovickaTest {

    private static final String DUPLICITA_ZVIRATA = "!!DUPLICITA VE ZVÍŘATECH!!";
    private static final String DUPLICITA_RODINA = "!!DUPLICITA V RODINĚ!!";
    private static final String DUPLICITA_JIDLO_A_PITI = "!!DUPLICITA V JÍDLE A PITÍ!!";
    private static final String DUPLICITA_CISLA = "!!DUPLICITA V ČÍSLECH!!";
    private static final String DUPLICITA_BARVY = "!!DUPLICITA V BARVÁCH!!";
    private static final String DUPLICITA_VOLNY_CAS = "!!DUPLICITA VE VOLNÉM ČASU!!";
    private static final String DUPLICITA_SPORT = "!!DUPLICITA VE SPORTU!!";
    private static final String DUPLICITA_PRIRODA = "!!DUPLICITA V PŘÍRODĚ!!";
    private static final String DUPLICITA_OSOBNOST = "!!DUPLICITA V OSOBNOSTI!!";
    private static final String DUPLICITA_DOPRAVA = "!!DUPLICITA V DOPRAVĚ!!";
    private static final String DULICITA_BYDLENI = "!!DUPLICITA V BYDLENÍ!!";
    private static final String DUPLICITA_STATY = "!!DUPLICITA VE STÁTECH!!";


    @Test
    public void kategorie1ZvirataDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie1Zvirata.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }

                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;
                    System.out.println(DUPLICITA_ZVIRATA);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie2RodinaDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie2Rodina.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictinyACestiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;
                    System.out.println(DUPLICITA_RODINA);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie3JidloAPitiDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie3JidloAPiti.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;
                    System.out.println(DUPLICITA_JIDLO_A_PITI);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie4CislaDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie4Cisla.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;
                    System.out.println(DUPLICITA_CISLA);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie5BarvyDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie5Barvy.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;

                    System.out.println(DUPLICITA_BARVY);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie6VolnyCasDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie6VolnyCas.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;

                    System.out.println(DUPLICITA_VOLNY_CAS);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie7SportDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie7Sport.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;

                    System.out.println(DUPLICITA_SPORT);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie8PrirodaDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie8Priroda.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;

                    System.out.println(DUPLICITA_PRIRODA);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie9OsobnostDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie9Osobnost.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;

                    System.out.println(DUPLICITA_OSOBNOST);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie10DopravaDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie10Doprava.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;

                    System.out.println(DUPLICITA_DOPRAVA);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie11BydleniDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie11Bydleni.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;

                    System.out.println(DULICITA_BYDLENI);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }

    @Test
    public void kategorie12StatyDuplicita() {
        ArrayList<Slovicko> slovicka = Kategorie12Staty.pripravKategorii();

        boolean obsahujeDuplicitu = false;

        for (int i = 0; i < slovicka.size(); i++) {
            for (int j = 0; j < slovicka.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (slovicka.get(i).equalsPodleAnglictiny(slovicka.get(j))) {
                    obsahujeDuplicitu = true;

                    System.out.println(DUPLICITA_STATY);
                    System.out.println(slovicka.get(i).toString());

                }

            }
        }

        assertFalse(obsahujeDuplicitu);

    }
}
