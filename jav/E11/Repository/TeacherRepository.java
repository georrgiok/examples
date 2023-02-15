package Repository;

import Model.Teacher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeacherRepository {
    private final List<Teacher> teachers = new ArrayList<>();
    private final List<String> teachersString = new ArrayList<>();
    String outputFileName = "teachers.txt";

    //Добавление/сохранение в файл c перезаписью
    public void saveTeacher( Teacher teacher){
        System.out.println("Записано в файл:");
        try (FileWriter fileWriter = new FileWriter(outputFileName)) {
            fileWriter.write(teacher.toString());
            fileWriter.append('\n');
            teachers.add(teacher);
            System.out.println(teacher);
            fileWriter.flush();
        } catch (IOException ignored) {
        }
    }

    //Добавление в файл без перезаписи
    public void saveAppendTeacher(Teacher teacher) {
        System.out.println("Дозаписано в файл:");
        try (FileWriter fileWriter = new FileWriter(outputFileName, true)) {
            fileWriter.write(teacher.toString());
            fileWriter.append('\n');
            teachers.add(teacher);
            System.out.println(teacher);
            fileWriter.flush();
        } catch (IOException ignored) {
        }
    }

    //Чтение из файла
    public void readTeacher() {
        teachersString.clear();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(outputFileName))) {
            String line;
            System.out.println("из файла:");
            while ((line = reader.readLine()) != null) {
                teachersString.add(line);
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }

    //Сохранение всего списка учителей в файл
    public void saveAllTeachers(List<Teacher> users){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {
            System.out.println("студенты в файле:");
            for (Teacher user : users) {
                writer.write(user.toString());
                writer.append("\n");
            }
            System.out.println(users);
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    //Удаление учителя из файла
    public void removeTeacher(Teacher teacher) {
        if (teachers.contains(teacher)) {
            teachers.remove(teacher);
            saveAllTeachers(teachers);
        }
    }

    //Получение списка всех учителей
    public List<Teacher> getAllTeachers() {
        System.out.println("Список всех учителей");
        return this.teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
    public List<String> getTeachersString() {
        return teachersString;
    }
}