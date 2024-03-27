package student.application.system.application.system.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import student.application.system.application.system.Service.ParentService;
import student.application.system.application.system.models.Parent;

@RestController
@RequestMapping("/parents")
@CrossOrigin("http://localhost:4200")
public class ParentController {
    @Autowired
    private ParentService ParentService;

    @PostMapping
    public Parent saveParent(@RequestBody Parent parent) {
        return ParentService.saveParent(parent);
    }

    @GetMapping
    public List<Parent> getAllParents() {
        return ParentService.getAllParents();
    }

    @DeleteMapping("/{id}")
    public void deleteParent(@PathVariable Long id) {
        ParentService.deleteParent(id);
    }

}
