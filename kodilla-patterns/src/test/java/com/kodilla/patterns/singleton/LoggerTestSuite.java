package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void addLog () {
        Logger.getInstance().log("123");
        Logger.getInstance().log("345");
    }

    @Test
    public void getLastLog () {
        //Given
        //When
        String log = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("345", log);
    }
}
