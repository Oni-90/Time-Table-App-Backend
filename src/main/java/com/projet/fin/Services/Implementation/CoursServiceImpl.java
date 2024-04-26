package com.projet.fin.Services.Implementation;

import com.projet.fin.Models.*;
import com.projet.fin.Repository.*;
import com.projet.fin.Services.CoursService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CoursServiceImpl implements CoursService {

    private final CoursRepo coursRepo;
    private  ClasseRepo classeRepo;
    private MatiereRepo matiereRepo;
    private EnseignantRepo enseignantRepo;
    private AnneeRepo anneeRepo;



    @Autowired
    public CoursServiceImpl(CoursRepo coursRepo) {
        this.coursRepo = coursRepo;
    }

    public List<Cours> getAll() {
        return coursRepo.findAll();
    }


    public Cours add(Cours cours) {
//
//        Matiere matiere= matiereRepo.findByNom(cours.getMatiere().getNom());
//        Enseignants enseignants= enseignantRepo.findByNom(cours.getEnseignants().getNom());
//        Annee annee = anneeRepo.findAnneeByAnne(cours.getAnnee().getAnne());
//        Classe classe= classeRepo.findByIntitule(cours.getClasse().getIntitule());
//
//        cours.setEnseignants(enseignants);
//        cours.setAnnee(annee);
//        cours.setMatiere(matiere);
//        cours.setClasse(classe);

        return coursRepo.save(cours);
    }

    public Cours update(Long id, Cours cours) {
        Cours existingCours = getCours(id);
        if (existingCours != null) {
            existingCours.setMatiere(cours.getMatiere());
            existingCours.setEnseignants(cours.getEnseignants());
            existingCours.setClasse(cours.getClasse());
            existingCours.setAnnee(cours.getAnnee());
            return coursRepo.save(existingCours);
        } else {
            throw new IllegalArgumentException("Cours non trouvé avec l'ID : " + id);
        }
    }

    public void delete(Long id) {
        coursRepo.deleteById(id);
    }

    public Cours getCours(Long id) {
        Optional<Cours> optionalCours = coursRepo.findById(id);
        return optionalCours.orElseThrow(() -> new IllegalArgumentException("Cours non trouvé avec l'ID : " + id));
    }

}
