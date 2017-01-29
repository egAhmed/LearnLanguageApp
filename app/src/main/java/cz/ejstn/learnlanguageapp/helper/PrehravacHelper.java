package cz.ejstn.learnlanguageapp.helper;

import android.media.MediaPlayer;

/**
 * Created by Martin Soukup on 29.1.2017.
 */

public class PrehravacHelper {

    private PrehravacHelper() {
    }

    public static void releasniPrehravac (MediaPlayer prehravac) {
        if (prehravac != null) {
            prehravac.release();
        }
    }

    // TODO: 29.1.2017 ještě by to šlo udělat lépe tak, že by se nevytvářel pokaždý nový objekt toho
    // on complete listeneru, ale že by pro každou kategorii byl jenom jeden no...

    public static void pripojOnCompletionListener (MediaPlayer prehravac) {
        prehravac.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                PrehravacHelper.releasniPrehravac(mp);
            }
        });
    }


}
