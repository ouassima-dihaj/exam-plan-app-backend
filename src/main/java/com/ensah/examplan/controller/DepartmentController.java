package com.ensah.examplan.controller;

import com.ensah.examplan.model.Admin;
import com.ensah.examplan.model.Department;
import com.ensah.examplan.service.AdminService;
import com.ensah.examplan.service.DeprtementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departements")
@CrossOrigin("http://localhost:3000/")
public class DepartmentController {
    @Autowired
    private DeprtementService deprtementService;

    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartements(){
        List<Department> departments = deprtementService.getAllDepartments();
        return ResponseEntity.ok(departments);
    }
    @GetMapping("{idDepartment}")
    public ResponseEntity<Department> getidDepartmentById(@PathVariable("idDepartment") Long id){
        Department departement = deprtementService.getDepartmentyId(id);
        return ResponseEntity.ok(departement);
    }
}
