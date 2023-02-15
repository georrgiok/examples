package Service.impls;

import Model.Student;
import Model.User;

import Service.StudentService;
import Repository.StudentRepository;

import java.util.List;

public class StudentServiceImpl<S extends User> implements StudentService {
    private final StudentRepository repository = new StudentRepository();

    @Override
    public void add(Student student) {
        if (student != null) {
            repository.save(student);
        } else {
            System.out.println("Нет студентов");
        }


    }

    @Override
    public void remove(Student student) {
        if (student != null){
            repository.remove(student);
        }


    }

    @Override
    public void addAppend(Student student) {
        if (student != null) {
            repository.saveAppend(student);
        } else {
            System.out.println("Нет студентов");
        }
    }
    @Override
    public void read() {
        repository.read();
    }

    @Override
    public List getAllStudents() {
        return repository.getAllStudents();
    }
}
