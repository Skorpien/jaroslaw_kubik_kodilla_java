package com.kodilla.testing.library;

public class Book {
    String tittle;
    String author;
    int publicationYear;

    public Book(String tittle, String author, int publicationYear) {
        this.tittle = tittle;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTittle() {
        return tittle;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (publicationYear != book.publicationYear) return false;
        if (!tittle.equals(book.tittle)) return false;
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = tittle.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + publicationYear;
        return result;
    }
}
