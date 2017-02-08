package cz.ejstn.learnlanguageapp.helper;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.FunFact;

/**
 * Created by Martin Soukup on 8.2.2017.
 */

public final class NavigationFunFactHelper {

    private static final ArrayList<FunFact> seznamFunFaktu = new ArrayList<FunFact>() {{

        add(new FunFact(R.drawable.zvirata_koala, "Koala spends up to 18 to 20 hours a day sleeping", "Koala naspí až 18-20 hodin denně"));

        add(new FunFact(R.drawable.zvirata_panda, "Panda spends 14 to 16 hours a day eating bamboo", "Panda denně stráví 14-16 hodin jezením bambusu"));

        add(new FunFact(R.drawable.zvirata_lev, "Lion in the wild spends around 20 hours a day resting", "Lev v divočině opočívá okolo 2O hodin denně"));

        add(new FunFact(R.drawable.zvirata_kocka, "Cats are said to have 9 lives", "Říká se, že kočky mají 9 životů"));

        add(new FunFact(R.drawable.zvirata_pes, "Dog's sense of smell is 10 000-100 000 times more acurate than ours", "Psí čich je 10 000-100 000 krát přesnější než ten lidský"));

        add(new FunFact(R.drawable.zvirata_delfin, "Dolphins are very intelligent compared to other animals", "Oproti ostatním zvířatům jsou delfíni velmi chytří"));

        add(new FunFact(R.drawable.zvirata_medved, "Bear can run twice as fast as human", "Medvěd dokáže běžet dvakrát rychleji než člověk"));

        add(new FunFact(R.drawable.zvirata_tucnak, "Penguins can drink sea water", "Tučňáci mohou pít mořskou vodu"));

        add(new FunFact(R.drawable.jidlo_pizza, "Many people believe pineapple should not be put on pizza", "Mnoho lidí věří, že na pizzu by se neměl dávat ananas"));

        add(new FunFact(R.drawable.jidlo_parek_v_rohliku, "National Hot Dog Day has been celebrated since the 1950's", "Národní den hotdogů se slaví od 50. let 20. století"));

        add(new FunFact(R.drawable.jidlo_banan, "Bannanas contain a lot of potassium", "Banány obsahují spoustu draslíku"));

        add(new FunFact(R.drawable.volnycas_spani, "Humans spend 1/3 if their life sleeping", "Lidé stráví jednu třetinu života spaním"));

        add(new FunFact(R.drawable.jidlo_caj, "After water, tea is the most consumed drink in the world", "Čaj je po vodě nejkonzumovanější nápoj na světě"));

        add(new FunFact(R.drawable.jidlo_kava, "in 1683, one pound of coffee in New York was worth as much as 4 acres of land", "V roce 1683 měla v New Yorku jedna libra kávy hodnotu 4 akrů půdy"));
    }};


    private NavigationFunFactHelper() {

    }

    public static FunFact vygenerujFunFact() {

        int nahodne = (int) (Math.random() * seznamFunFaktu.size());

        return seznamFunFaktu.get(nahodne);

    }

    public static ArrayList<FunFact> getSeznamFunFaktu() {
        return seznamFunFaktu;
    }
}