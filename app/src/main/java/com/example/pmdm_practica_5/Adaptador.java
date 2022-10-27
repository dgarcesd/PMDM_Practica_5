package com.example.pmdm_practica_5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
    // 2 - Creamos algunos atributos necesarios para etsa clase
    private ArrayList<Musica> listaMusica;
    private Context context;

    // 3 - Generamos el constructor
    public Adaptador(ArrayList<Musica> listaMusica, Context context) {
        this.listaMusica = listaMusica;
        this.context = context;
    }

    // 4 - Este metodole indica a la ListView cuantos elementos va a tener
    @Override
    public int getCount() {
        return listaMusica.size();
    }
    // 5 - Este metodo nos va a devolver la posicion
    @Override
    public Musica getItem(int position) {
        return listaMusica.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    // 6 - Aqui se va a crear cada item y se le asignan los valores de cada elemento a cada item
    // Este metodo se va a ejecutar tantas veces como elementos tenga la lista
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // 8 Creamos el elemento pelicula
        Musica musica = getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.musica_lista, null);
        // 7 - Vamos a crear cada elemento que va a contener el item
        ImageView imgDisco = convertView.findViewById(R.id.imgDisco);
        TextView cantante = convertView.findViewById(R.id.Cantante);
        TextView cancion = convertView.findViewById(R.id.Cancion);
        TextView anio = convertView.findViewById(R.id.Anio);

        // 8 - Vamos a llenar con datos cada elemento
        imgDisco.setImageResource(musica.getImgDisco());
        cantante.setText(musica.getCantante());
        cancion.setText(musica.getCancion());
        anio.setText(musica.getAnio());

        return convertView;
    }
}
