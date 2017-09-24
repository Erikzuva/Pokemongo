package com.edu.erik.apppokemongo.model;

/**
 * Created by Erik on 22/09/2017.
 */

public class Mensaje {
    private String titulo;
    private String mensaje;
    private int icono;

    public Mensaje() {

    }

    public Mensaje(String titulo, String mensaje, int icono) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.icono = icono;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }
}
