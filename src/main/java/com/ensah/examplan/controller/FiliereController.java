package com.ensah.examplan.controller;

import com.ensah.examplan.model.Admin;
import com.ensah.examplan.model.Department;
import com.ensah.examplan.model.Filiere;
import com.ensah.examplan.service.AdminService;
import com.ensah.examplan.service.DeprtementService;
import com.ensah.examplan.service.FiliereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/filieres")
@CrossOrigin("http://localhost:3000")
public class FiliereController {
    @Autowired
    private FiliereService filiereService;

    @GetMapping
    public ResponseEntity<List<Filiere>> getAllFilieres(){
        List<Filiere> filieres = filiereService.getAllFilieres();
        return ResponseEntity.ok(filieres);
    }
}
