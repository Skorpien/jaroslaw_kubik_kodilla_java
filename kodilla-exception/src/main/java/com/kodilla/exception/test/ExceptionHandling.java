package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(3.0,5.0);
        } catch (Exception e) {
            System.out.println("Houston, we have a problem");
        } finally {
            System.out.println("I'll be there for you...");
        }
    }

}
