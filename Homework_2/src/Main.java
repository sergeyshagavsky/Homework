import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Student> students = StudentReader.readStudents("students.txt");

        students.stream()
                .peek(System.out::println)
                .peek(student -> System.out.println(student.getBooks()))
                .flatMap(student -> student.getBooks().stream())
                .sorted()
                .distinct()
                .filter(book -> book.getYear() > 2000)
                .limit(3)
                .map(Book::getYear)
                .findFirst()
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Такая книга отсутствует")
                );

    }
}