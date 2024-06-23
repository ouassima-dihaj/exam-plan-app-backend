package com.ensah.examplan.repository;

import com.ensah.examplan.model.Department;
import com.ensah.examplan.model.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereRepository extends JpaRepository<Filiere, Long> {
}
