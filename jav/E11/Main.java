import Model.Student;
import Model.Teacher;
import Service.StudentService;
import Service.impls.StudentServiceImpl;
import Service.impls.TeacherServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

//        ДЕЙСТВИЯ СО СТУДЕНТАМИ
        System.out.println("Журнал студентов \n");
        StudentServiceImpl<Student> studentService = new StudentServiceImpl<>();
        //Сохранение в файл студента
        Student ivan = new Student("Иван Н.В.", 4.92f , 4, new Teacher("Алла Н.Г", new ArrayList<>()));
        studentService.add(ivan);

        //Добавление в файл студента
        Student anna = new Student(" Анна Г.Н.", 4.5f , 6, new Teacher("Ольга Т.А.", new ArrayList<>()));
        Student olga = new Student("Ольга В.В.", 4.9f , 6, new Teacher("Алла Н.Г.", new ArrayList<>()));
        studentService.addAppend(anna);
        studentService.addAppend(olga);

        //Чтение из файла студентов
        studentService.read();

        //Удаление из файла студента иван
        studentService.remove(ivan);

        //Добавление в файл студента валерия
        Student lera = new Student("Валерия Т.", 4.3f , 8, new Teacher("Алекс А.А.", new ArrayList<>()));
        studentService.addAppend(lera);

        //Получение списка всех студентов на текущую дату
        System.out.println(studentService.getAllStudents());

//        ДЕЙСТВИЯ С УЧИТЕЛЯМИ
        System.out.println("Журнал учитилей\n");
        TeacherServiceImpl<Teacher> teacherService = new TeacherServiceImpl<>();

        //Сохранение в файл учителя Алла и списка ее студентов
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(ivan);
        myStudents.add(olga);
        teacherService.addTeacher(new Teacher("Алла Н.Г.", myStudents));

        //Добавление в файл учителя Ольга и списка ее студентов
        List<Student> myStudents2 = new ArrayList<>();
        myStudents2.add(anna);
        Teacher Olga = new Teacher("Ольга Т.А.", myStudents2);
        teacherService.addAppendTeacher(Olga);

        //Чтение из файла учителей
        teacherService.readTeacher();

        //Удаление из файла учителя Ольга 
        teacherService.removeTeacher(Olga);

        //Получение списка всех учителей
        System.out.println(teacherService.getAllTeachers());



    }
}