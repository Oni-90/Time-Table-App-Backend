package com.projet.fin.Controllers;

import com.projet.fin.Models.Annee;
import com.projet.fin.Models.Matiere;
import com.projet.fin.Services.MatiereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matiere")
public class MatiereController {

    @Autowired
    private MatiereService matiereService;

    @GetMapping("/getAll")
    public List<Matiere> getAll(){
        return matiereService.getAll();
    }

    @PostMapping(value = "/add", consumes = "application/json", produces = "application/json")
    public Matiere add(@RequestBody Matiere matiere){
        return matiereService.add(matiere);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Matiere> update(@PathVariable Long id, @RequestBody Matiere matiere){
        return ResponseEntity.status(HttpStatus.OK).body(matiereService.update(id, matiere));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        matiereService.delete(id);
    }

    @GetMapping("/get/{id}")
    public Matiere getMatiere( @PathVariable Long id){
        return matiereService.getMatiere(id);
    }

    @GetMapping("/findByNom/{nom}")
    public Matiere findByNom( @PathVariable String nom){
        return matiereService.findByNom(nom);
    }
}
