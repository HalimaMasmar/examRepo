package com.example;

import com.alibou.school.CoursRepository;
import com.alibou.school.CoursesResponse;
import com.alibou.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoursesService {

    private final CoursRepository repository;
    private final StudentClient client;

    public void saveSchool(com.alibou.school.Courses school) {
        repository.save(school);
    }

    public List<com.alibou.school.Courses> findAllSchools() {
        return repository.findAll();
    }

    public CoursesResponse findSchoolsWithStudents(Integer schoolId) {
        var school = repository.findById(schoolId)
                .orElse(
                        com.alibou.school.Courses.builder()
                                .name("NOT_FOUND")
                                .email("NOT_FOUND")
                                .build()
                );

        return CoursesResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
