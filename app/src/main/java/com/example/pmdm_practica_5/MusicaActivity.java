package com.example.pmdm_practica_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MusicaActivity extends AppCompatActivity {

    // 9 - Me declaro el ListView y el Adaptador
    private ListView lvMusica;
    private Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musica);
        // 10 - Lo enlazo
        lvMusica = findViewById(R.id.lvLista);
        adaptador = new Adaptador(obtenerListaMusica(), this);
        // 12 - Asignamos el adaptador al listView
        lvMusica.setAdapter(adaptador);


    }
    // 11 - Me creo un metodopara obtener la lista de peliculas
    private ArrayList<Musica> obtenerListaMusica(){
        ArrayList<Musica> listaMusica = new ArrayList<>();

        listaMusica.add(new Musica(R.drawable.el_nano,"Melendi","El Nano", "2005"));
        listaMusica.add(new Musica(R.drawable.love_me_again,"John Newman","Love Me Again","2013"));
        listaMusica.add(new Musica(R.drawable.viva_la_vida,"Coldplay","Viva La Vida","2008"));
        listaMusica.add(new Musica(R.drawable.just_drive,"Alistair Griffin","Just Drive","2012"));
        listaMusica.add(new Musica(R.drawable.on_our_way,"The Royal Concept","On Our Way","2013"));
        listaMusica.add(new Musica(R.drawable.dance_monkey,"Tones and I","Dance Monkey","2019"));
        listaMusica.add(new Musica(R.drawable.demons,"Imagine Dragons","Demons","2012"));
        listaMusica.add(new Musica(R.drawable.kids,"MGMT","Kids","2007"));
        listaMusica.add(new Musica(R.drawable.para_toda_la_vida,"El sueño de morfeo","Para toda la vida","2007"));
        listaMusica.add(new Musica(R.drawable.sonrisa_especial,"El sueño de morfeo","Sonrisa especial","2005"));

        return listaMusica;
    }
}