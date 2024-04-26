package com.projet.fin.Repository;

import com.projet.fin.Models.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepo extends JpaRepository<Cours, Long> {

}
