package com.company.model;

public class SuperPair <E, T, A extends Number> {
    E var1;
    T var2;
    A nr;

    public SuperPair(E var1, T var2, A nr) {
        this.var1 = var1;
        this.var2 = var2;
        this.nr = nr;
    }
}
