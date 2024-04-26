package com.projet.fin.Services;

import com.projet.fin.Models.Annee;

import java.util.List;

public interface AnneeService {
    public List<Annee> getAll();
    public Annee add(Annee annee);
    public Annee update(Long id,Annee annee);
    public void delete(Long id);

    public  Annee findAnneeByAnne(String anne);
    public Annee getAnnee(Long id);

}
