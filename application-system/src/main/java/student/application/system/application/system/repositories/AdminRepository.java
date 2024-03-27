package student.application.system.application.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import student.application.system.application.system.models.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByPassword(String password);

    Admin findByname(String name);

}
