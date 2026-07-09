import java.util.Objects;

public class Book implements Comparable<Book> {

    private String name;
    private String author;
    private int pages;
    private int year;

    public Book(String name, String author, int pages, int year) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.pages, o.pages);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name)
                && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }

    @Override
    public String toString() {
        return name +
                ", " + author +
                " (" + year +
                ", " + pages + " стр.)";
    }
}