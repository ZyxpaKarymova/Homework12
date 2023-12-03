package sky.pro;

import sky.pro.Author;

public class Book {
    String name;
    Author author;
    int publishYear;

    public Book(String name, Author author, int publishYear) {
        this.name = name;
        this.author = author;
        this.publishYear = publishYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

}

