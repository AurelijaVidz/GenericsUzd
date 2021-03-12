package com.company;

import com.company.model.SuperPair;

public class Main
{
    public static void main( String[] args )
    {
        SuperPair<String, Double, Double> pair1 = new SuperPair<>("1AAA", 17.2, 4.);
        SuperPair<String, String, Integer> pair2 = new SuperPair<>("2BBB", "2CCC", 9);

        // error - String class does not extends Number
      // SuperPair<String, String, String> pair3 = new SuperPair<>("3DDD", "3EEE", "dff");
    }
}
