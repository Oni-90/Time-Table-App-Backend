package com.projet.fin.Services.Implementation;

import com.projet.fin.Models.Annee;
import com.projet.fin.Repository.AnneeRepo;
import com.projet.fin.Services.AnneeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class AnneeServiceImpl implements AnneeService {
    @Autowired
    private AnneeRepo anneeRepo;

    @Override
    public List<Annee> getAll(){
        return anneeRepo.findAll();
    }

    @Override
    public Annee add(Annee annee){
        return anneeRepo.save(annee);
    }

    @Override
    public Annee update(Long id,Annee annee){
        Annee anneeExit= anneeRepo.findById(id).orElseThrow(()->new RuntimeException("L'annee n'existe pas=" +id ));
        return anneeRepo.save(anneeExit);
    }
    private void reorganizeIds() {
        List<Annee> annees = anneeRepo.findAll();
        for (int i = 0; i < annees.size(); i++) {
            Annee annee = annees.get(i);
            annee.setId((long) (i + 1)); // Reaffecter les identifiants sequentiellement
            anneeRepo.save(annee);
        }
    }


    @Override
    public void delete(Long id){
        anneeRepo.deleteById(id);
        reorganizeIds();
    }
    @Override
    public Annee findAnneeByAnne(String anne){
        Annee annee= anneeRepo.findAnneeByAnne(anne);
        return annee;
    }



    @Override
    public Annee getAnnee(Long id){
        Annee annee = anneeRepo.findById(id).orElse(null);
        return annee;
    }

}
