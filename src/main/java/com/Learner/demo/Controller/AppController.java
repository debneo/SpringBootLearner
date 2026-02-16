package com.Learner.demo.Controller;

import com.Learner.demo.Model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AppController {
    List<Student> studentList = new ArrayList<>();

    @GetMapping("/message")
    public String getMessage() {
        return "You reached to 1st API. DAMN YOU !!!";
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentList;
    }

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student) {
        studentList.add(student);
    }

    @DeleteMapping("/delete/{roll}")
    public void deleteStudent(@PathVariable int roll) {
        for(Student student : studentList) {
            if(student.getRoll()==roll) {
                studentList.remove(student);
            }
        }
    }

    @PutMapping("/update/{roll}")
    public void updateStudent(@PathVariable int roll, @RequestBody Student student) {
        for(Student data : studentList) {
            if(data.getRoll()==roll) {
                data.setRoll(student.getRoll());
                data.setName(student.getName());
            }
        }
    }
}
