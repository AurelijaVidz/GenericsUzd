package com.company.model;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Double> listDouble;

    public ListOfNumbers() {
        listDouble = new ArrayList<>();
    }

    public void addNumber(Double num) {
        listDouble.add(num);
    }

    public double getAverage() {
        double sum = 0;

        for (Double i : listDouble) {
            sum += i;
        }

        return sum / listDouble.size();
    }

    public List<Double> getListDouble() {
        return listDouble;
    }
}
