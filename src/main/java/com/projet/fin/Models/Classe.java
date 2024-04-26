package com.projet.fin.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String intitule;


    public Classe(Long id, String intitule) {
        this.intitule = intitule;
        this.id = id;
    }

    public Classe() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }

}
