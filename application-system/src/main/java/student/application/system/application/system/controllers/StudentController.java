package student.application.system.application.system.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import student.application.system.application.system.DTO.StudentDTO;
import student.application.system.application.system.Service.StudentService;
import student.application.system.application.system.models.Student;

@RestController
@RequestMapping("/students")
@CrossOrigin("http://localhost:4200")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    @GetMapping("/studentRecords")
    public List<StudentDTO>getAllStudentDTO(){
        List<StudentDTO> studentDTO= studentService.getAllStudentDTO();
        return studentDTO;
    }
    
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }

}
