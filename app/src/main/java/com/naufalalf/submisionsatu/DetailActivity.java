package com.naufalalf.submisionsatu;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    TextView juduldetil, ratingdetil, rilisdetil, sinopsisdetil;
    ImageView gambardetil;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ItemFilm itemFilmr = getIntent().getParcelableExtra("JudulFilm");

        juduldetil = findViewById(R.id.tvjuduldetil);
        rilisdetil = findViewById(R.id.tv_rilis_detail);
        ratingdetil = findViewById(R.id.tv_rating_detail);
        sinopsisdetil = findViewById(R.id.sinopsis_detail);
        gambardetil = findViewById(R.id.gambar_detil);

        Picasso.get().load(itemFilmr.getGambar()).into(gambardetil);
        juduldetil.setText(itemFilmr.getJudul());
        rilisdetil.setText(itemFilmr.getRilis());
        ratingdetil.setText(itemFilmr.getRating());
        sinopsisdetil.setText(itemFilmr.getSinopsis());

    }
}
