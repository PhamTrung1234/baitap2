package com.example.baitap1.service.Imp;

import com.example.baitap1.entity.Department;
import com.example.baitap1.repository.DepartmentRepository;
import com.example.baitap1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
}
