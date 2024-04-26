package com.projet.fin.Services;

import com.projet.fin.Models.Cours;
import com.projet.fin.Repository.CoursRepo;

import java.util.List;

public interface CoursService {
    public List<Cours> getAll();

    public Cours add(Cours cours);

    public Cours update(Long id,Cours cours);


    public void delete(Long id);

    public Cours getCours(Long id);


}
