package com.example.pmdm_practica_5;

public class Musica {

    private int imgDisco;
    private String Cantante;
    private String Cancion;
    private String Anio;

    public Musica(int imgDisco, String Cantante, String Cancion, String Anio) {
        this.imgDisco = imgDisco;
        this.Cantante = Cantante;
        this.Cancion = Cancion;
        this.Anio = Anio;
    }

    public int getImgDisco() {
        return imgDisco;
    }

    public String getCantante() {
        return Cantante;
    }

    public String getCancion() {
        return Cancion;
    }

    public String getAnio() {
        return Anio;
    }
}

