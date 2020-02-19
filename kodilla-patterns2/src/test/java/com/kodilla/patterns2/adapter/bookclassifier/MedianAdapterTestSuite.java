package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> books = new HashSet<>();
        books.add(new Book("author1", "title1", 2007, "1234"));
        books.add(new Book("author2", "title2", 2001, "4567"));
        books.add(new Book("author3", "title3", 1999, "8901"));
        //When
        int median = adapter.publicationYearMedian(books);
        //Then
        assertEquals(median, 2001);
    }
}
