package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain<addResult> {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        Calculator calculator = new Calculator();

        int addResult = calculator.add(2, 3);
        int subResult = calculator.subtract(3, 2);

        if (addResult == 5) {
            System.out.println("Calculator add test - OK");
        } else {
            System.out.println("Calculator add test - Error!");
        }

        if (subResult == 1) {
            System.out.println("Calculator subtract test - OK");
        } else {
            System.out.println("Calculator add test - Error!");
        }
    }
}
