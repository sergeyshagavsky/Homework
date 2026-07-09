import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentReader {

    public static List<Student> readStudents(String fileName) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get(fileName));

        List<Student> students = new ArrayList<>();

        String studentName = "";
        List<Book> books = new ArrayList<>();

        for (String line : lines) {

            line = line.trim();

            // Если встретилась пустая строка - заканчиваем текущего студента
            if (line.isEmpty()) {
                if (!studentName.isEmpty()) {
                    students.add(new Student(studentName, books));
                    studentName = "";
                    books = new ArrayList<>();
                }
                continue;
            }

            // Если строка не содержит запятых - это имя студента
            if (!line.contains(",")) {
                studentName = line.replace(";", "");
                continue;
            }

            // Иначе это книга
            String[] arr = line.replace(";", "").split(",");

            books.add(new Book(
                    arr[0].trim(),
                    arr[1].trim(),
                    Integer.parseInt(arr[2].trim()),
                    Integer.parseInt(arr[3].trim())
            ));
        }

        // Добавляем последнего студента
        if (!studentName.isEmpty()) {
            students.add(new Student(studentName, books));
        }

        return students;
    }
}