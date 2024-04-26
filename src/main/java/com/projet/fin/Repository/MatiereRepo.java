package com.projet.fin.Repository;

import com.projet.fin.Models.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereRepo extends JpaRepository<Matiere,Long> {
    public Matiere findByNom(String nom);
}
