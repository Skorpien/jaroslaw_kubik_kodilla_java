package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> nonOdd = new ArrayList<Integer>();

        for(Integer numb : numbers) {
            if (numb%2==0) {
                nonOdd.add(numb);
            }
        }
        return nonOdd;
    }
}
