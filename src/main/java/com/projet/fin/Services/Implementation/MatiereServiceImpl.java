package com.projet.fin.Services.Implementation;

import com.projet.fin.Models.Enseignants;
import com.projet.fin.Models.Matiere;
import com.projet.fin.Repository.MatiereRepo;
import com.projet.fin.Services.MatiereService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MatiereServiceImpl implements MatiereService {

    @Autowired
    private MatiereRepo matiereRepo;

   @Override
   public List<Matiere> getAll(){
        return matiereRepo.findAll();
    }

    @Override
    public Matiere add(Matiere matiere){
       Matiere m = new Matiere();
       System.out.println(matiere.getNom());
       m.setNom(matiere.getNom());
       return matiereRepo.save(m);
    }

    @Override
    public Matiere update(Long id, Matiere matiere){
        Matiere matiereExit = matiereRepo.findById(id).orElseThrow(() -> new RuntimeException("La matiere n'existe pas=" + id));
        return matiereRepo.save(matiereExit );
    }

    @Override
    public void delete(Long id){
       matiereRepo.deleteById(id);
    }

    @Override
    public Matiere getMatiere(Long id){
       Matiere matiere = matiereRepo.findById(id).orElse(null);
       return matiere;
    }

    @Override
    public Matiere findByNom(String nom){
        Matiere matiere = matiereRepo.findByNom(nom);
        return matiere;
    }

}
