package student.application.system.application.system.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import student.application.system.application.system.models.Perfomance;
// import student.application.system.application.system.DTO.StudentPerformanceDTO;
import student.application.system.application.system.Service.PerformanceService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/performances")
public class PerfomanceController {

    @Autowired
    private PerformanceService performanceService;

    @PostMapping
    public ResponseEntity<Perfomance> save(@RequestBody Perfomance perfomance) {
        Perfomance save = performanceService.save(perfomance);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    @GetMapping("/{performanceId}")
    public ResponseEntity<Perfomance> getPerformanceByIdr(@PathVariable Long perfomanceById) {
        Optional<Perfomance> performance = performanceService.getPerformanceById(perfomanceById);
        return performance.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Perfomance>> getAllPerformances() {
        List<Perfomance> performances = performanceService.getAllPerformances();
        return new ResponseEntity<>(performances, HttpStatus.OK);
    }

    @DeleteMapping("/{performanceId}")
    public ResponseEntity<Void> deletePerformance(@PathVariable Long performanceId) {
        performanceService.deletePerformance(performanceId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
