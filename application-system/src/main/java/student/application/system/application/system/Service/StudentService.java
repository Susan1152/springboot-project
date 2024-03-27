package student.application.system.application.system.Service;
import org.springframework.stereotype.Service;
import student.application.system.application.system.DTO.StudentDTO;
import student.application.system.application.system.models.Student;
import student.application.system.application.system.repositories.StudentRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public List<StudentDTO> getAllStudentDTO() {
        return((List<Student>) studentRepository
                 .findAll())
                .stream()
                .map(this::convertEntitytoDto)
                .collect(Collectors.toList());
    }

    private StudentDTO convertEntitytoDto(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        
        studentDTO.setAdmissionNumber(student.getAdmissionNumber());
        studentDTO.setParentPhoneNumber(student.getParentPhoneNumber());
        return studentDTO;

    }

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    
    public Student saveStudent(Student student) {
        return studentRepository.save(student);}
    
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    
}
