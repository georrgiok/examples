package Service;

import Model.Student;
import Model.Teacher;
import Model.User;

import java.util.List;

public interface TeacherService <T extends User> {
    void addTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);
    void addAppendTeacher(Teacher teacher);
    void readTeacher();
    List<Teacher> getAllTeachers();
}
