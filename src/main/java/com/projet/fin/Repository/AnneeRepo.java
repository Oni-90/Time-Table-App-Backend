package com.projet.fin.Repository;

import com.projet.fin.Models.Annee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface AnneeRepo extends JpaRepository<Annee, Long> {
//    public Annee findAnneeByDate_debut(LocalDate date_debut);
    public Annee findAnneeByAnne(String anne);
}
