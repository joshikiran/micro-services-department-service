package com.microservices.department.service;

import com.microservices.department.entity.Department;
import com.microservices.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department save(Department department) {
        log.info("Inside Save of Department Service");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long id) {
        log.info("Inside findByDepartmentId of Department Service");
        return departmentRepository.findByDepartmentId(id);
    }
}
