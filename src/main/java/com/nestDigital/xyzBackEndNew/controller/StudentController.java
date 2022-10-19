package com.nestDigital.xyzBackEndNew.controller;

import com.nestDigital.xyzBackEndNew.dao.StudentDAO;
import com.nestDigital.xyzBackEndNew.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentDAO dao;
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/studentEntry",consumes = "application/json",produces = "application/json")
    public String studentEntry(@RequestBody StudentModel student){
        System.out.println(student.toString());
        dao.save(student);
        return "{status:'success'}";
    }

}
