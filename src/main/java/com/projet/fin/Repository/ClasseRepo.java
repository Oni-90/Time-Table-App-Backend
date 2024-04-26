package com.projet.fin.Repository;

import com.projet.fin.Models.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepo extends JpaRepository<Classe, Long> {
    public Classe findByIntitule(String intitule);


}
