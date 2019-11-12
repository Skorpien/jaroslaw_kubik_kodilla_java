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
            e.printStackTrace();
        }

        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.getBooks().removeIf((Book b) -> b.getPublicationDate().getYear() < 2003);

        //Then
        System.out.println(library.getName());
        Assert.assertEquals("Library", library.getName());
        System.out.println(library.getBooks());
        Assert.assertEquals(3, library.getBooks().size());
        System.out.println(cloneLibrary.getName());
        Assert.assertEquals("Library", cloneLibrary.getName());
        System.out.println(cloneLibrary.getBooks());
        Assert.assertEquals(3, cloneLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getName());
        Assert.assertEquals("Library", deepClonedLibrary.getName());
        System.out.println(deepClonedLibrary.getBooks());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
