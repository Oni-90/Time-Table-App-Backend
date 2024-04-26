package com.projet.fin.Services.Implementation;

import com.projet.fin.Models.Annee;
import com.projet.fin.Models.Enseignants;
import com.projet.fin.Repository.EnseignantRepo;
import com.projet.fin.Services.EnseignantService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class EnseignantServiceImpl implements EnseignantService {
    @Autowired
    private EnseignantRepo enseignantRepo;
    @Override
    public List<Enseignants> getAll(){
        return enseignantRepo.findAll();
    }

    @Override
    public Enseignants add(Enseignants enseignants){
        return enseignantRepo.save(enseignants);
    }

    @Override
    public Enseignants update(Long id, Enseignants enseignants) {
        Enseignants enseignantExit = enseignantRepo.findById(id).orElseThrow(() -> new RuntimeException("Le prof n'existe pas=" + id));
        return enseignantRepo.save(enseignantExit);
    }

    @Override
    public void delete(Long id){
        enseignantRepo.deleteById(id);
    }

    @Override
    public Enseignants getEnseignant(Long id){
        Enseignants enseignants = enseignantRepo.findById(id).orElse(null);
        return enseignants;
    }

    @Override
    public Enseignants findByNom(String nom){
        Enseignants enseignants = enseignantRepo.findByNom(nom);
        return enseignants;
    }

}
