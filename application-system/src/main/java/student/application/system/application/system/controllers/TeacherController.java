package student.application.system.application.system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import student.application.system.application.system.Service.TeacherService;
import student.application.system.application.system.models.Teacher;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@CrossOrigin("http://localhost:4200")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // Endpoint to get all teachers
    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    // Endpoint to get a specific teacher by ID

    // Endpoint to create a new teacher
    @PostMapping
    public Teacher saveTeacher(@RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    // Endpoint to update an existing teacher

    // Endpoint to delete a teacher by ID
    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teacherService.deleteTeacher(id);
    }
}
