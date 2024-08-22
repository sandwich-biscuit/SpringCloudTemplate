package com.tfs.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TeacherA {

    private final RestTemplate restTemplate;

    public TeacherA(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/getteacher")
    public String getTeacher() {
        return "teacher, " + this.restTemplate.getForObject(
            "http://student/getstudent", String.class);
    }
}
