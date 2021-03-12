package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class Mapas<E, V> {
    List<Pora<E, V>> sarasasPoru;

    {
        sarasasPoru = new ArrayList<Pora<E, V>>();
    }

    public void ideti(E raktas, V reiksme) {
        Pora<E, V> pora = new Pora<>(raktas, reiksme);
        sarasasPoru.add(pora);
    }

    public V gauti(E raktas) {
        V reiksme = null;

        a:
        for (Pora<E, V> p : sarasasPoru) {
            if (p.getRaktas() == raktas) {
                reiksme = p.getReiksme();
                break;
            }
        }

        return reiksme;
    }
}
