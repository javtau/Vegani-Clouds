package com.javier_lozano.vegani_clouds;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class cards_Adapter extends BaseAdapter {

    Context contexto;
    ArrayList<Prenda> prendas;


    public cards_Adapter(Context contexto, ArrayList<Prenda> prendas) {
        this.contexto = contexto;
        this.prendas = prendas;
    }

    @Override
    public int getCount() {
        return prendas.size();
    }

    @Override
    public Object getItem(int i) {
        return prendas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(contexto).inflate(R.layout.fragment_card, null);
            holder = new ViewHolder();

            holder.txt_nombre = (TextView) convertView.findViewById(R.id.txt_nombre);
            holder.txt_precio = (TextView) convertView.findViewById(R.id.txt_precio);
            holder.img_prenda = (ImageView) convertView.findViewById(R.id.img_product);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txt_nombre.setText(prendas.get(position).getNombre());
        holder.txt_precio.setText(prendas.get(position).getPrecio());
        Picasso.with(contexto).load(prendas.get(position).getImg()).into(holder.img_prenda);


        return convertView;
    }


    class ViewHolder {
        ImageView img_prenda;
        TextView txt_nombre, txt_precio;

    }
}