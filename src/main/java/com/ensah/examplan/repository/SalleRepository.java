package com.ensah.examplan.repository;

import com.ensah.examplan.model.Examen;
import com.ensah.examplan.model.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Long> {
    @Query(value = "SELECT * FROM salle WHERE id_examen =  ?1 ", nativeQuery = true)
    List<Salle> findByExamenId( Long examenId);

}
