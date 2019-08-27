package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] table = {1,2,3};

        //When
        double average = ArrayOperations.getAverage(table);

        //Then
        double expected = 2.0;
        Assert.assertEquals(expected, average, 0.01);
    }
}
