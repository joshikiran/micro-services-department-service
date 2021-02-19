package com.microservices.department.controller;

import com.microservices.department.entity.Department;
import com.microservices.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside SaveDepartment of Department Controller");
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long id){
        log.info("Inside getDepartment of Department Controller");
        return departmentService.findByDepartmentId(id);
    }
}
