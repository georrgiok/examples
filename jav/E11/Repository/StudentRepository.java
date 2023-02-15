package Repository;

import Model.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class StudentRepository {
    private final List<Student> users = new ArrayList<>();
    private final List<String> usersString = new ArrayList<>();
    String outputFileName = "students.txt";

    //Добавление/сохранение в файл c перезаписью
    public void save(Student student) {
        System.out.println("Записано в файл:");
        try (FileWriter fileWriter = new FileWriter(outputFileName)) {
            fileWriter.write(student.toString());
            fileWriter.append('\n');
            users.add(student);
            System.out.println(student);
            fileWriter.flush();
        } catch (IOException ignored) {
        }
    }

    //Добавление в файл без перезаписи
    public void saveAppend( Student student) {
        System.out.println("Дозаписано в файл:");
        try (FileWriter fileWriter = new FileWriter(outputFileName, true)) {
            fileWriter.write(student.toString());
            fileWriter.append('\n');
            users.add(student);
            System.out.println(student);
            fileWriter.flush();
        } catch (IOException ignored) {
        }
    }

    //Чтение из файла
    public void read() {
        usersString.clear();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(outputFileName))) {
            String line;
            System.out.println("из файла:");
            while ((line = reader.readLine()) != null) {
                usersString.add(line);
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    //Сохранение всего списка студентов в файл
    public void saveAll(List<Student> users){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            System.out.println("студенты в файле:");
            for (Student user : users) {
                writer.write(user.toString());
                writer.append("\n");
            }
            System.out.println(users);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    //Удаление студента из файла
    public boolean remove(Student student) {
    if (users.contains(student)) {
        users.remove(student);
        saveAll(users);
        return true;
    }
    return false;
}

    //Получение списка всех студентов
    public List<Student> getAllStudents() {
        System.out.println("Список всех студентов");
        return this.users;
    }
}