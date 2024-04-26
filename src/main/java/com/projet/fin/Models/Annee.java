package com.projet.fin.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;



@Entity
public class Annee  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String anne;




    public Annee(String anne){
        this.anne = anne;


    }

    public Annee() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String  getAnne() {
        return anne;
    }

    public void setDAnne(String  anne) {
        this.anne=anne;
    }


}
