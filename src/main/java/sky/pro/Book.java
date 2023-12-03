package sky.pro;

import java.util.Objects;

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

    public String toString() {
        return "Имя " + this.name + ", Автор " + this.author + ", год публикации " + this.publishYear;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author) && Objects.equals(publishYear, book.publishYear);
    }

    public int hashCode() {
        return Objects.hash(name, author, publishYear);
    }


}

