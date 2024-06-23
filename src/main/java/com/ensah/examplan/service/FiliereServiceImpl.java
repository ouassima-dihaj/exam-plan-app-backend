package com.ensah.examplan.service;

import com.ensah.examplan.model.Department;
import com.ensah.examplan.model.Filiere;
import com.ensah.examplan.repository.DepartementRepositoory;
import com.ensah.examplan.repository.FiliereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FiliereServiceImpl implements FiliereService{
    @Autowired
    private FiliereRepository filiereepositoory;
    @Override
    public List<Filiere> getAllFilieres() {
        return filiereepositoory.findAll();
    }
}
