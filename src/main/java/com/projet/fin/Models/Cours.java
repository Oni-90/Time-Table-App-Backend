package com.projet.fin.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

@Entity
public class Cours {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Enseignants enseignants;

    @ManyToOne
    private Classe classe;

    @ManyToOne
    private Matiere matiere;

    @ManyToOne
    private Annee annee;

    // Constructeurs, getters et setters

    public Cours() {
    }

    public Cours(Enseignants enseignants, Classe classe, Matiere matiere, Annee annee) {
        this.enseignants = enseignants;
        this.classe = classe;
        this.matiere = matiere;
        this.annee = annee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enseignants getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(Enseignants enseignants) {
        this.enseignants = enseignants;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public Annee getAnnee() {
        return annee;
    }

    public void setAnnee(Annee annee) {
        this.annee = annee;
    }
}