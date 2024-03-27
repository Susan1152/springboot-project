package student.application.system.application.system.DTO;

import java.util.Date;

import student.application.system.application.system.models.Classroom;
import student.application.system.application.system.models.Subject;

public class StudentPerformanceDTO {

    private Long admissionNumber;

    public Long getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(Long admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    private String classroom;
    private int marks;
    private String subject;

    // Constructors, getters, setters, etc.

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public StudentPerformanceDTO(Long admissionNumber, String classroom, int marks, String subject) {
        this.admissionNumber = admissionNumber;

        this.classroom = classroom;
        this.marks = marks;
        this.subject = subject;
    }

    public StudentPerformanceDTO(Long admissionNumber2, Date dateOfExam, Classroom classroom2, Double marks2,
            Subject subject2) {
    
    }

    // Additional constructors, getters, setters if needed
}
