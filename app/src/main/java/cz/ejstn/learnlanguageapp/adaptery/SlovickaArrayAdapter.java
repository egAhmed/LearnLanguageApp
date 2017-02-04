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