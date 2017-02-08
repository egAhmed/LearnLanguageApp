package cz.ejstn.learnlanguageapp.helper;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.FunFact;

/**
 * Created by Martin Soukup on 8.2.2017.
 */

public final class NavigationFunFactHelper {

    private static final ArrayList<FunFact> seznamFunFaktu1 = new ArrayList<FunFact>() {{

        add(new FunFact(R.drawable.zvirata_koala, "Koala spends up to 18 to 20 hours a day sleeping", "Koala naspí až 18-20 hodin denně"));

        add(new FunFact(R.drawable.zvirata_panda, "Panda spends 14 to 16 hours a day eating bamboo", "Panda denně stráví 14-16 hodin jezením bambusu"));

        add(new FunFact(R.drawable.zvirata_lev, "Lion in the wild spends around 20 hours a day resting", "Lev v divočině opočívá okolo 2O hodin denně"));

        add(new FunFact(R.drawable.zvirata_kocka, "Cats are said to have 9 lives", "Říká se, že kočky mají 9 životů"));

        add(new FunFact(R.drawable.zvirata_pes, "Dog's sense of smell is 10 000-100 000 times more acurate than ours", "Psí čich je 10 000-100 000 krát přesnější než ten lidský"));

        add(new FunFact(R.drawable.zvirata_delfin, "Dolphins are very intelligent compared to other animals", "Oproti ostatním zvířatům jsou delfíni velmi chytří"));

        add(new FunFact(R.drawable.zvirata_medved, "Bear can run twice as fast as human", "Medvěd dokáže běžet dvakrát rychleji než člověk"));

        add(new FunFact(R.drawable.zvirata_tucnak, "Penguins can drink sea water", "Tučňáci mohou pít mořskou vodu"));

        add(new FunFact(R.drawable.jidlo_pizza, "Many people believe pineapple should not be put on pizza", "Mnoho lidí věří, že na pizzu by se neměl dávat ananas"));


    }};


    private NavigationFunFactHelper() {

    }

    public static FunFact vygenerujFunFact() {

        int nahodne = (int) (Math.random() * seznamFunFaktu1.size());

        return seznamFunFaktu1.get(nahodne);

    }


}