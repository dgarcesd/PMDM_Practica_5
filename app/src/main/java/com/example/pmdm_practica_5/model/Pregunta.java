package com.example.pmdm_practica_5.model;

public class Pregunta {
    private Integer numPregunta;
    private String respuesta1;
    private String respuesta2;
    private String respuesta3;

    public Pregunta(Integer numPregunta, String respuesta1, String respuesta2, String respuesta3) {
        this.numPregunta = numPregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
    }

    public Integer getNumPregunta() {
        return numPregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }
}
