package Controller;

import Model.Student;
import Model.Teacher;
import Model.User;

import Service.StudentService;
import Service.impls.StudentServiceImpl;

//Контроллер
public class StudentController {
    private final StudentServiceImpl<Student> studentService = new StudentServiceImpl<>();
    public void getStudentInfo(String name, float grade, int year, Teacher teacher){
        studentService.add(new Student(name, grade, year, teacher));
    }
}
