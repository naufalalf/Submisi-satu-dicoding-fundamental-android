package com.naufalalf.submisionsatu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ArrayList<ItemFilm> listfilm;
    private ListView lvfilm;
    private AdapterFilm adapterFilm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvfilm = findViewById(R.id.lv_film);
        listfilm= new ArrayList<>();
        listfilm.addAll(FilmData.getData());
        adapterFilm = new AdapterFilm(this);
        adapterFilm.setListfilm(listfilm);
        lvfilm.setAdapter(adapterFilm);

        lvfilm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                ItemFilm itemFilm = listfilm.get(position);

                ItemFilm ifilm = new ItemFilm();
                ifilm.setJudul(itemFilm.getJudul());
                ifilm.setRilis(itemFilm.getRilis());
                ifilm.setGambar(itemFilm.getGambar());
                ifilm.setRating(itemFilm.getRating());
                ifilm.setSinopsis(itemFilm.getSinopsis());

                intent.putExtra("JudulFilm",ifilm);
                startActivity(intent);
            }

        });
    }




}
