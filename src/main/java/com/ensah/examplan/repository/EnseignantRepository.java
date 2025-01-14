package com.ensah.examplan.repository;

import com.ensah.examplan.model.Enseignant;
import com.ensah.examplan.model.Personnel;
import com.ensah.examplan.model.Salle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
    @Query(value = "select * from personnel where email = ?1", nativeQuery = true)
    Optional<Enseignant> findByEmail(String email);

    @Query(value = "SELECT personnel.*, creneaux.heure_debut_dispo as creneaux_heure_debut_dispo, " +
            "creneaux.heure_fin_dispo as creneaux_heure_fin_dispo " +
            "FROM personnel " +
            "JOIN creneaux ON personnel.id_personnel = creneaux.id_personnel " +
            "WHERE personnel.groupe_id = :idGroupe " +
            "AND personnel.type = 'Enseignant' " +
            "AND personnel.id_salle IS NULL " +
            "AND creneaux.heure_debut_dispo = :heureDebutExam " +
            "AND creneaux.heure_fin_dispo = :heureFinExam " +
            "LIMIT :surveillantCount", nativeQuery = true)
    List<Enseignant> findSurveillantsByGroupe(@Param("idGroupe") Long idGroupe, @Param("surveillantCount") Long surveillantCount, @Param("heureDebutExam") LocalTime heureDebutExam, @Param("heureFinExam") LocalTime heureFinExam);

    @Query(value = "SELECT p.* FROM personnel p " +
            "WHERE p.id_salle = ?1 ", nativeQuery = true)
    List<Enseignant> findEnseignantBySalleIdAndAvailability(
            @Param("salleId") Long salleId);


}
