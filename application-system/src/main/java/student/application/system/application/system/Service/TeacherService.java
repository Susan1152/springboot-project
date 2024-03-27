package student.application.system.application.system.Service;

import org.springframework.stereotype.Service;
import student.application.system.application.system.models.Teacher;
import student.application.system.application.system.repositories.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @SuppressWarnings("null")
    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @SuppressWarnings("null")
    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
