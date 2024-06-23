package com.ensah.examplan.service;

import com.ensah.examplan.model.Admin;
import com.ensah.examplan.model.Department;
import com.ensah.examplan.model.Enseignant;
import com.ensah.examplan.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface DeprtementService {
    List<Department> getAllDepartments();
    Department getDepartmentyId(Long idDepartment);
}
