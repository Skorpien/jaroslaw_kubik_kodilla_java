package com.kodilla.hibernate.manytomany.facade;

public class SearchingException extends Exception {

    public static final String ERR_NO_COMPANY = "No company";
    public static final String ERR_NO_EMPLOYEE = "No employee";

    public SearchingException (String message) {
        super(message);
    }
}
