package com.projet.fin.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;


    public Matiere(){

    }

    public  Matiere(String nom){
        this.nom=nom;

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

}
