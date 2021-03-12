package com.company;

public class Main {
    public static void main(String[] args) {
        Integer mas[] = {1, 2, 3};
        String mas1[] = {"Hello", "World"};

        printArray(mas);
        printArray(mas1);

    }

    private static <T> void printArray(T[] t) {
        for (T i : t) {
            System.out.println(i);
        }
    }
}
