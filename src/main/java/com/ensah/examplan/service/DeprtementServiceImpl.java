package com.ensah.examplan.service;

import com.ensah.examplan.exception.ResourceNotFoundException;
import com.ensah.examplan.model.Admin;
import com.ensah.examplan.model.Department;
import com.ensah.examplan.repository.AdminRepository;
import com.ensah.examplan.repository.DepartementRepositoory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeprtementServiceImpl implements DeprtementService
{
    @Autowired
    private DepartementRepositoory departementRepositoory;
    @Override
    public List<Department> getAllDepartments() {
        return departementRepositoory.findAll();
    }
    @Override
    public Department getDepartmentyId(Long idDep) {
        return departementRepositoory.findById(idDep).orElseThrow(() -> new ResourceNotFoundException("le personnel ave cet id n'existe pas" +idDep ));
    }
}
