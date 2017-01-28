package cz.ejstn.learnlanguageapp.adapter;

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

public class SlovickaAdapter extends ArrayAdapter<Slovicko> {

    private int barvaPozadi;



    public SlovickaAdapter(Context context, ArrayList<Slovicko> slovicka, int  barvaPozadi) {
        super(context, 0, slovicka);

        this.barvaPozadi = barvaPozadi;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Slovicko slovicko = getItem(position);

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.model_polozka, parent, false);
        }

        LinearLayout layoutObouPrekladu = (LinearLayout) listItemView.findViewById(R.id.linear_layout_obou_prekladu);
        layoutObouPrekladu.setBackgroundResource(barvaPozadi);


        TextView horniText = (TextView) listItemView.findViewById(R.id.horni_text_polozky);
        horniText.setText(slovicko.getAnglictina());

        TextView spodniText = (TextView) listItemView.findViewById(R.id.dolni_text_polozky);
        spodniText.setText(slovicko.getCestina());

        ImageView obrazek = (ImageView) listItemView.findViewById(R.id.obrazek_polozky);

        if (slovicko.maObrazek()) {
            obrazek.setImageResource(slovicko.getIdObrazku());
            obrazek.setVisibility(View.VISIBLE);
        } else {
            obrazek.setVisibility(View.GONE);
        }

        return listItemView;
    }
}