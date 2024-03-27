package student.application.system.application.system.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import student.application.system.application.system.models.Parent;
import student.application.system.application.system.repositories.ParentRepository;

@Service
public class ParentService {

    private static final Logger logger = LoggerFactory.getLogger(ParentService.class);

    private final ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    public List<Parent> getAllParents() {
        logger.info("Getting all parents");
        List<Parent> parents = parentRepository.findAll();
        logger.info("Retrieved {} parents", parents.size());
        return parents;
    }

    public Optional<Parent> getParentById(Long id) {
        logger.info("Getting parent with ID: {}", id);
        @SuppressWarnings("null")
        Optional<Parent> parent = parentRepository.findById(id);
        logger.info("Retrieved parent: {}", parent.orElse(null));
        return parent;
    }

    public Parent saveParent(Parent parent) {
        logger.info("Saving parent: {}", parent);
        @SuppressWarnings("null")
        Parent savedParent = parentRepository.save(parent);
        logger.info("Saved parent: {}", savedParent);
        return savedParent;
    }

    @SuppressWarnings("null")
    public void deleteParent(Long id) {
        logger.info("Deleting parent with ID: {}", id);
        parentRepository.deleteById(id);
        logger.info("Deleted parent with ID: {}", id);
    }
}
