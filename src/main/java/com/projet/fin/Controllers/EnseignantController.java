package com.projet.fin.Controllers;

import com.projet.fin.Models.Annee;
import com.projet.fin.Models.Enseignants;
import com.projet.fin.Services.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.annotation.PersistenceExceptionTranslationAdvisor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/prof")
public class EnseignantController {
    @Autowired
    private EnseignantService enseignantService;

    @GetMapping("/getAll")
    public List<Enseignants> getAll(){
        return enseignantService.getAll();
    }

    @PostMapping("/add")
    public Enseignants add(@RequestBody Enseignants prof){
        return  enseignantService.add(prof);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Enseignants> update(@PathVariable Long id, @RequestBody Enseignants enseignants){
        return ResponseEntity.status(HttpStatus.OK).body(enseignantService.update(id, enseignants));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        enseignantService.delete(id);
    }

    @GetMapping("/get/{id}")
    public Enseignants getEnseignant(@PathVariable Long id){
        return enseignantService.getEnseignant(id);
    }

    @GetMapping("/findByNom/{nom}")
    public Enseignants findByNom(@PathVariable String nom){
        return enseignantService.findByNom(nom);
    }
}
