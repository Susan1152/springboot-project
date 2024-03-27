package student.application.system.application.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import student.application.system.application.system.models.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {

}
