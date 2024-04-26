package com.projet.fin.Controllers;

import com.projet.fin.Models.Annee;
import com.projet.fin.Services.AnneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/annee")
public class AnneeController {
    @Autowired
    private AnneeService anneeService;

    @GetMapping("/getAll")
    public List<Annee> getAll(){
        return anneeService.getAll();
    }

    @PostMapping(value = "/add", headers = "Accept= application/json")
    public Annee add(@RequestBody Annee annee){
        return anneeService.add(annee);
    }

    @PutMapping(value = "/update/{id}", headers = "Accept= application/json")
    public ResponseEntity<Annee> update(@PathVariable Long id, @RequestBody Annee annee){
        return ResponseEntity.status(HttpStatus.OK).body(anneeService.update(id, annee));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        anneeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/get/{id}")
    public Annee getAnnee(@PathVariable Long id){
        return anneeService.getAnnee(id);
    }

    @GetMapping("/findAnneeByAnne/{anne}")
    public Annee findAnneeByAnne(@PathVariable String anne){
        return anneeService.findAnneeByAnne(anne);
    }
}
