package com.alibou.school;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CoursesResponse {

    private String name;
    private String email;
    List<Student> students;
}
