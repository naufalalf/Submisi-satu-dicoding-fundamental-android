package com.naufalalf.submisionsatu;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemFilm implements Parcelable {
    private String judul;
    private String gambar;
    private String sinopsis;
    private String rilis;
    private String rating;

    public ItemFilm() {
    }
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getRilis() {
        return rilis;
    }

    public void setRilis(String rilis) {
        this.rilis = rilis;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.gambar);
        dest.writeString(this.sinopsis);
        dest.writeString(this.rilis);
        dest.writeString(this.rating);
    }

    protected ItemFilm(Parcel in) {
        judul = in.readString();
        gambar = in.readString();
        sinopsis = in.readString();
        rilis = in.readString();
        rating = in.readString();
    }

    public static final Parcelable.Creator<ItemFilm> CREATOR = new Parcelable.Creator<ItemFilm>() {
        @Override
        public ItemFilm createFromParcel(Parcel source) {
            return new ItemFilm(source);
        }

        @Override
        public ItemFilm[] newArray(int size) {
            return new ItemFilm[size];
        }
    };
}
