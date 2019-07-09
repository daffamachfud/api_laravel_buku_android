package com.daffa.belajarapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BukuResult {
    @SerializedName("buku")
    @Expose
    private List<Buku> bukus= null;

    public List<Buku> getBukus() {
        return bukus;
    }
}
