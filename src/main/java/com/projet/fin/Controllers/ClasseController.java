package com.projet.fin.Controllers;

import com.projet.fin.Models.Annee;
import com.projet.fin.Models.Classe;
import com.projet.fin.Services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("/salle")
@CrossOrigin ("*")
public class ClasseController {

    @Autowired
    private ClasseService classeService;



    @GetMapping("/getAll")
    public List<Classe> getAll(){
        return classeService.getAll();
    }

    @PostMapping("/add")
    public  Classe add(@RequestBody Classe salle ){
        return classeService.add(salle);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Classe> update(@PathVariable Long id, @RequestBody Classe classe){
        return ResponseEntity.status(HttpStatus.OK).body(classeService.update(id, classe));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        classeService.delete(id);
    }

    @GetMapping("/get/{id}")
    public Classe getClasse(@PathVariable Long id){
        return classeService.getClasse(id);
    }


    @GetMapping("/findByIntitule/{intitule}")
    public Classe findByIntitule(@PathVariable String intitule){
        return classeService.findByIntitule(intitule);
    }
//    @RequestMapping(method = RequestMethod.OPTIONS)
//    public ResponseEntity<?> handleOptions() {
//        return ResponseEntity.ok().build();
//    }

}
