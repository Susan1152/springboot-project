package student.application.system.application.system.Service;

import student.application.system.application.system.repositories.PerfomanceRepository;

import student.application.system.application.system.models.Perfomance;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import lombok.NonNull;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceService {

    
    private static final Logger logger = LoggerFactory.getLogger(PerformanceService.class);

    private final PerfomanceRepository perfomanceRepository;

    public PerformanceService(PerfomanceRepository perfomanceRepository){
        this.perfomanceRepository=perfomanceRepository;
    
    }
   public Perfomance save(Perfomance perfomance){
    logger.info("Saving perfomance");
    return perfomanceRepository.save(perfomance);
   }
    
    public Optional<Perfomance> getPerformanceById(@NonNull Long performanceId) {
        return perfomanceRepository.findById(performanceId);
    }

    public List<Perfomance> getAllPerformances() {
        return perfomanceRepository.findAll();
    }

    
    public void deletePerformance(@NonNull Long performanceId) {
        perfomanceRepository.deleteById(performanceId);
    }

}
