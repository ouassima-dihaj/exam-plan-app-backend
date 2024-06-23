package com.ensah.examplan.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Enseignant extends Personnel {

 @Column(unique = true)
 private String email;
 private String password;

 @OneToMany(mappedBy = "enseignant", cascade = CascadeType.ALL, orphanRemoval = true)
 @JsonIgnoreProperties("enseignant")
 private List<ElementPedagogique> elementPedagogiques = new ArrayList<>();

 @ManyToOne
 @JoinColumn(name = "department_id", referencedColumnName = "idDepartment")
 @JsonIgnoreProperties("enseignants")
 Department department;

 @ManyToOne
 @JoinColumn(name = "filiere_id", referencedColumnName = "idFiliere")
 @JsonIgnoreProperties("enseignants")
 Filiere filiere;

 @ManyToOne(fetch = FetchType.EAGER)
 @JoinColumn(name = "groupe_id", referencedColumnName = "idGroupe")
 @JsonIgnoreProperties({"enseignants", "hibernateLazyInitializer", "handler"})
 Groupe groupe;
}