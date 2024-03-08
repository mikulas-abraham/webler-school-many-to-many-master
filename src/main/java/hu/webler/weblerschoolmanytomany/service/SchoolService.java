package hu.webler.weblerschoolmanytomany.service;

import hu.webler.weblerschoolmanytomany.entity.School;
import hu.webler.weblerschoolmanytomany.persistence.SchoolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;

    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public List<School> getSchool() {
        return schoolRepository.findAll();
    }

    public void addSchool(School school) {
        schoolRepository.save(school);
    }

    public void updateSchool(School school) {
        schoolRepository.save(school);
    }

    public void deleteSchool(School school_id) {
        schoolRepository.delete(school_id);
    }
}
