package cz.ejstn.learnlanguageapp.adaptery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.model.Slovicko;

/**
 * Created by Martin Soukup on 27.1.2017.
 */

public class SlovickaArrayAdapter extends ArrayAdapter<Slovicko> {

    private int barvaPozadi;


    public SlovickaArrayAdapter(Context context, ArrayList<Slovicko> slovicka, int barvaPozadi) {
        super(context, 0, slovicka);

        this.barvaPozadi = barvaPozadi;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Slovicko slovicko = getItem(position);

        View jednaPolozka = convertView;
        if (jednaPolozka == null) {
            jednaPolozka = LayoutInflater.from(getContext()).inflate(
                    R.layout.model_radek_listview, parent, false);
        }

        // vyřeší bug s tím, že když žmáčknu talčítko a pojedu nahoru/dolu, on bude kopírovat ten stav toho zakliknutého
        // a ta recyklace způsobí, že ty view se tam ukážou se zakliklou play ikounou, i když se na ně
        // ve skutečnosti nekliklo
        ImageView playIkonka = (ImageView) jednaPolozka.findViewById(R.id.play_ikonka);
        playIkonka.setImageResource(R.drawable.ic_play_arrow_white_36dp);

        LinearLayout layoutObouPrekladu = (LinearLayout) jednaPolozka.findViewById(R.id.linear_layout_obou_prekladu);
        layoutObouPrekladu.setBackgroundResource(barvaPozadi);


        TextView horniText = (TextView) jednaPolozka.findViewById(R.id.horni_text_polozky);
        horniText.setText(slovicko.getAnglictina());

        TextView spodniText = (TextView) jednaPolozka.findViewById(R.id.dolni_text_polozky);
        spodniText.setText(slovicko.getCestina());

        ImageView obrazek = (ImageView) jednaPolozka.findViewById(R.id.obrazek_polozky);

        if (slovicko.maObrazek()) {
            obrazek.setImageResource(slovicko.getIdObrazku());
            obrazek.setVisibility(View.VISIBLE);
        } else {
            obrazek.setVisibility(View.GONE);
        }


        return jednaPolozka;
    }
}