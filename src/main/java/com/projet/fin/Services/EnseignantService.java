package com.projet.fin.Services;

import com.projet.fin.Models.Enseignants;

import java.util.List;

public interface EnseignantService {
public List<Enseignants> getAll();
public Enseignants add(Enseignants enseignants);
public Enseignants update(Long id, Enseignants enseignants);
public void delete(Long id);

public Enseignants findByNom(String nom);
public Enseignants getEnseignant(Long id);
}
