package student.application.system.application.system.models;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Perfomance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performanceId;

    public Long getPerformanceId() {
        return performanceId;
    }

    public void setPerformanceId(Long performanceId) {
        this.performanceId = performanceId;
    }
    private Long admissionNumber;
    
    public Long getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(Long admissionNumber) {
        this.admissionNumber = admissionNumber;
    }
    @Enumerated(EnumType.STRING)
    private Classroom classroom;

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Enumerated(EnumType.STRING)
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    private Double marks;

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    private Date DateOfExam;

    public Perfomance() {
    }

    public Date getDateOfExam() {
        return DateOfExam;
    }

    public void setDateOfExam(Date dateOfExam) {
        DateOfExam = dateOfExam;
    }

}
