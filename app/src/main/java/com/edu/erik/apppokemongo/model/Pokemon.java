package com.edu.erik.apppokemongo.model;

/**
 * Created by Erik on 16/09/2017.
 */

public class Pokemon {
    private int id;
    private String categoria;
    private String tipo;
    private int ataque;
    private int defensa;
    private int vida;
    private int foto;

    public Pokemon() {
    }

    public Pokemon(int id, String categoria, String tipo, int ataque, int defensa, int vida, int foto) {
        this.id = id;
        this.categoria = categoria;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.vida = vida;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
