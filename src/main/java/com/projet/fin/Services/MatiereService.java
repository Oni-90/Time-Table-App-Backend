package com.projet.fin.Services;

import com.projet.fin.Models.Matiere;

import java.util.List;

public interface MatiereService {
    public List<Matiere> getAll();

    public Matiere add(Matiere matiere);

    public Matiere update(Long id,Matiere matiere);

    public void delete(Long id);

    public Matiere findByNom(String nom);

    public Matiere getMatiere(Long id);

}
