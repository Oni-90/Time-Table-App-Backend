package com.projet.fin.Services.Implementation;

import com.projet.fin.Models.Annee;
import com.projet.fin.Models.Classe;
import com.projet.fin.Repository.ClasseRepo;
import com.projet.fin.Services.ClasseService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ClasseServiceImpl implements ClasseService {

   @Autowired
   private ClasseRepo classeRepo;

   @Override
   public List<Classe> getAll(){
        return classeRepo.findAll();
    }

    @Override
    public Classe add(Classe classe){
        return classeRepo.save(classe);
    }

    @Override
    public Classe update(Long id, Classe classe) {
        Classe classeExit = classeRepo.findById(id).orElseThrow(() -> new RuntimeException("La salle  n'existe pas=" + id));
        return classeRepo.save(classeExit);
    }

    @Override
    public void delete(Long id){
       classeRepo.deleteById(id);
    }

    @Override
    public Classe getClasse(Long id){
       Classe classe = classeRepo.findById(id).orElse(null);
       return classe;
    }

    public  Classe findByIntitule(String intitule){
       Classe classe= classeRepo.findByIntitule(intitule);
       return  classe;
   }
}
