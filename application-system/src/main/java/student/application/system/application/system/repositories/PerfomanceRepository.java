package student.application.system.application.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import student.application.system.application.system.models.Perfomance;

public interface PerfomanceRepository extends JpaRepository<Perfomance, Long> {

    Perfomance save(Perfomance perfomance);


}
