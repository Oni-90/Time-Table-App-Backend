package com.projet.fin.Services;

import com.projet.fin.Models.Classe;

import java.util.List;

public interface ClasseService {
    public List<Classe> getAll();

    public Classe add(Classe classe);

    public Classe update(Long id,Classe classe);

    public void delete(Long id);

    public Classe findByIntitule(String intitule);

    public Classe getClasse(Long id);
}
