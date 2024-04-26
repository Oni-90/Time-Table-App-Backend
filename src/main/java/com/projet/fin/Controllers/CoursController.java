package com.projet.fin.Controllers;

import com.projet.fin.Models.Cours;
import com.projet.fin.Services.CoursService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cours")
public class CoursController {
    private final CoursService coursService;

    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }

    @GetMapping("/getAll")
    public List<Cours> getAll(){
        return coursService.getAll();
    }

    @PostMapping(value = "/add",headers = "Accept=application/json")
    public Cours add(@RequestBody Cours cours){

        return coursService.add(cours);
//        Cours addedCours = coursService.add(cours);
//        return new ResponseEntity<>(addedCours, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public Cours update(@PathVariable Long id,@RequestBody Cours cours){
        return coursService.update(id,cours);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        coursService.delete(id);
    }

    @GetMapping("/getCours/{id}")
    public Cours getCours(@PathVariable Long id){
        return coursService.getCours(id);
    }
}

