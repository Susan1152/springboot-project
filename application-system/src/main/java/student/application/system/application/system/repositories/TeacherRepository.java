package student.application.system.application.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import student.application.system.application.system.models.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
