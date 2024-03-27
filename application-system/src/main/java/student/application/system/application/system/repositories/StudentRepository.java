package student.application.system.application.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import student.application.system.application.system.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
