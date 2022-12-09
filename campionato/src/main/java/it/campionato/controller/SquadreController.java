package it.campionato.controller;

import it.campionato.model.Squadre;
import it.campionato.service.SquadreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SquadreController {
    @Autowired
    private SquadreServiceImpl squadreServiceImpl;

    @GetMapping("/squadre")
    public List<Squadre> getAllSquadre(){
        return squadreServiceImpl.getAllSquadre();
    }

    @GetMapping("/squadre/{id}")
    public Squadre getSquadra(@PathVariable Long id){
        return squadreServiceImpl.getSquadra(id);
    }
}
