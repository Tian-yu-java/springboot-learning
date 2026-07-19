package com.wcy.controller;

import com.wcy.model.Student;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadFileController {
    @Resource
    private Student student;

    @GetMapping("/readobject")
    public String readConfig() {
        String name=student.getName();
        Integer age=student.getAge();

        return  student.toString();
    }
}

