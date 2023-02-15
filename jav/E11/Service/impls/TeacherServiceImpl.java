package Service.impls;
import Model.User;
import Model.Teacher;
import Service.TeacherService;

import Repository.TeacherRepository;
import java.util.List;


public class TeacherServiceImpl<S extends User> implements TeacherService {
    private final TeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public void addTeacher(Teacher teacher) {
        if (teacher != null) {
            teacherRepository.saveTeacher(teacher);
        } else {
            System.out.println("Нет учителя");
        }
    }
    @Override
    public void removeTeacher(Teacher teacher) {
        teacherRepository.removeTeacher(teacher);
    }
    @Override
    public void addAppendTeacher(Teacher teacher) {
        if (teacher != null) {
            teacherRepository.saveAppendTeacher(teacher);
        } else {
            System.out.println("Нет учителя");
        }
    }
    @Override
    public void readTeacher() {
        teacherRepository.readTeacher();
    }
    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }
}