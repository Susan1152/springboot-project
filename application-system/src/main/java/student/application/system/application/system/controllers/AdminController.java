package student.application.system.application.system.controllers;

import student.application.system.application.system.models.Admin;
import student.application.system.application.system.Service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin("http://localhost:4200")
public class AdminController {
    private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public ResponseEntity<Admin> adminLogin(@RequestBody Admin admin) {
        String name = admin.getname();
        String password = admin.getPassword();

        logger.info("Attempting login for admin: {}", name);

        if (adminService.authenticateAdmin(name, password)) {
            logger.info("Login successful for admin: {}", name);
            return new ResponseEntity<>(admin, HttpStatus.OK);
        } else {
            logger.warn("Login failed for admin: {}", name);
            return new ResponseEntity<>(admin, HttpStatus.UNAUTHORIZED);
        }
    }
}