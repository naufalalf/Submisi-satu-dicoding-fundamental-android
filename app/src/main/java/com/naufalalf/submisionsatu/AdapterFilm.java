package com.naufalalf.submisionsatu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdapterFilm extends BaseAdapter {


    private Context context;
    private ArrayList<ItemFilm> listfilm;


    public class ViewHolder{

        private TextView viewjudul;
        private ImageView viewgambar;
        private TextView viewsinopsis;
        private TextView viewrilis;
        private TextView viewrating;


       public ViewHolder(View v) {

           this.viewjudul = v.findViewById(R.id.tvJudulfilm);
           this.viewgambar = v.findViewById(R.id.gambarFilm);
           this.viewrating = v.findViewById(R.id.tv_ratingfilm);
           this.viewrilis = v.findViewById(R.id.tv_rilis);
           this.viewsinopsis = v.findViewById(R.id.sinopsis);
       }

       void bind(ItemFilm itemFilm){
           viewjudul.setText(itemFilm.getJudul());
          Picasso.get().load(itemFilm.getGambar()).into(viewgambar);
           viewrating.setText("Rating" + itemFilm.getRating());
       }

    }

    public void setListfilm(ArrayList<ItemFilm> listfilm) {
        this.listfilm = listfilm;
    }

    public AdapterFilm(Context context) {
        this.context = context;
        listfilm = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return listfilm.size();
    }

    @Override
    public Object getItem(int position) {
        return listfilm.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_film,parent,false); }

        ViewHolder viewHolder = new ViewHolder(convertView);
        ItemFilm iFilm =(ItemFilm) getItem(position);
        viewHolder.bind(iFilm);

        return convertView;
    }
    }

