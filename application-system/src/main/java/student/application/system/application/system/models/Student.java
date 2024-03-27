package student.application.system.application.system.models;


import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String name;
    @Column(name = "admissionNumber")
    private Long admissionNumber;
    @Column(name="password")
    private String password;
    @Column(name = "parent_phone_number")
    private String parentPhoneNumber;
    @Column(name = "parent_email")
    private String parentEmail;
    @Column(name = "classroom")
    @Enumerated(EnumType.STRING)
    private Classroom classroom;

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAdmissionNumber() {
        return admissionNumber;
    }

    public void setAdmissionNumber(Long admissionNumber) {
        this.admissionNumber = admissionNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    // Constructors
    public Student() {
        // Default constructor
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}