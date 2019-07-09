package com.daffa.belajarapi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.daffa.belajarapi.R;
import com.daffa.belajarapi.model.Buku;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BukuAdapter extends ArrayAdapter<Buku> {

    public BukuAdapter(@NonNull Context context, int resource, @NonNull List<Buku> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item_buku, parent, false
            );
        }

        Buku buku = getItem(position);

        TextView tvJudul = (TextView) convertView.findViewById(R.id.tv_judul);
        tvJudul.setText(buku.getJudul());

        TextView tvPengarang = (TextView) convertView.findViewById(R.id.tv_pengarang);
        tvPengarang.setText(buku.getPengarang());

        TextView tvTahun = (TextView) convertView.findViewById(R.id.tv_tahun);
        tvTahun.setText(buku.getTahun());

        TextView tvISBN = (TextView) convertView.findViewById(R.id.tv_isbn);
        tvISBN.setText(buku.getIsbn());

        ImageView imageView = (ImageView) convertView.findViewById(R.id.img_sampul);
        Picasso.get()
                .load("http://172.17.2.131/belajarapi/public/" + buku.getSampul())
                .into(imageView);

        return convertView;
    }
}
