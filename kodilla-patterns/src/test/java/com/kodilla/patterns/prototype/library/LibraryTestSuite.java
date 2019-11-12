package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        IntStream.iterate(1, n -> n +1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("title" + n, "author" + n, LocalDate.of(2000 + n, 12, 12))));

        //making a shallow clone
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().removeIf((Book b) -> b.getPublicationDate().getYear() < 2003);

        //Then
        Assert.assertEquals("Library", library.getName());
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals("Library", cloneLibrary.getName());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());
        Assert.assertEquals("Library", deepClonedLibrary.getName());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
