package student.application.system.application.system.Service;

import student.application.system.application.system.models.Admin;
import student.application.system.application.system.repositories.AdminRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public boolean authenticateAdmin(String adminName, String password) {
        Admin searchedAdmin = adminRepository.findByname(adminName);
        Admin searchedAdminPassword = adminRepository.findByPassword(password);

        return searchedAdmin != null && searchedAdminPassword != null;
    }
}
