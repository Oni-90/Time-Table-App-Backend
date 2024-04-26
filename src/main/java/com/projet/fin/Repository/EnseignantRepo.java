package com.projet.fin.Repository;

import com.projet.fin.Models.Enseignants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnseignantRepo extends JpaRepository<Enseignants,Long> {
    public Enseignants findByNom(String nom);
}
