package com.ensah.examplan.service;

import com.ensah.examplan.exception.ResourceNotFoundException;
import com.ensah.examplan.model.Groupe;
import com.ensah.examplan.repository.ExamenRepository;
import com.ensah.examplan.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeServiceImpl implements GroupeService {
    @Autowired
    private GroupeRepository groupeRepository;
    @Override
    public List<Groupe> getAllGroupes() {
        return  groupeRepository.findAll();
    }
    @Override
    public Groupe getGroupeById(Long idGroupe) {
        return groupeRepository.findById(idGroupe).orElseThrow(() -> new ResourceNotFoundException("le filiere avec cet id n'existe pas" +idGroupe ));
    }
}
