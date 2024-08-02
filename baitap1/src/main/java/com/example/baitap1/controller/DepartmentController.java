package com.example.baitap1.controller;

import com.example.baitap1.service.DepartmentService;
import com.example.baitap1.service.Imp.DepartmentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DepartmentController {
    @Autowired
    private DepartmentServiceImp departmentService;

    @GetMapping()
    public ResponseEntity<?> showList() {
        return new ResponseEntity<>("alo",HttpStatus.OK);
    }
}
