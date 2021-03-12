package com.company.services;

import com.company.model.ListOfNumbers;

public class MaxAverageList {

    public ListOfNumbers findWithMaxAverage(ListOfNumbers... lists) {
        ListOfNumbers maxAvgList = null;
        Double maxAvg, avg;

        if (lists != null) {
            maxAvgList = lists[0];
            maxAvg = lists[0].getAverage();

            for (int i = 1; i < lists.length; i++) {
                Double sum = 0.;
                avg = lists[i].getAverage();
                if (avg > maxAvg) {
                    maxAvg = avg;
                    maxAvgList = lists[i];
                }
            }
        }

        return maxAvgList;
    }
}
