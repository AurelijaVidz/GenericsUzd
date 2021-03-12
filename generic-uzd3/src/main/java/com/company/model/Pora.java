package com.company.model;

public class Pora <E, V>{
    private E raktas;
    private V reiksme;

    public Pora(E raktas, V reiksme) {
        this.raktas = raktas;
        this.reiksme = reiksme;
    }

    public V getReiksme() {
        return reiksme;
    }

    public E getRaktas() {
        return raktas;
    }
}
