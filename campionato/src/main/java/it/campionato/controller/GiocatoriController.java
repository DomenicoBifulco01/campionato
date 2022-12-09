package it.campionato.controller;

import it.campionato.model.Giocatori;
import it.campionato.service.GiocatoriServiceImpl;
import it.campionato.service.SquadreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GiocatoriController {
    @Autowired
    private GiocatoriServiceImpl giocatoriService;

    @Autowired
    private SquadreServiceImpl squadreService;

    @GetMapping("/giocatori")
    public List<Giocatori> getAllGiocatori(){
        return giocatoriService.getAllGiocatori();
    }

    @GetMapping("/giocatori/{id}")
    public Giocatori getGiocatore(@PathVariable long id){
        return giocatoriService.getGiocatore(id);
    }

    @GetMapping("/giocatori/ricercaeta/{eta}")
    public  List<Giocatori> findGiocatoriByEta(@PathVariable int eta){
        return giocatoriService.findGiocatoriByEta(eta);
    }

    @PostMapping("/giocatori/{id_squadra}")
    public void addGiocatore(@PathVariable long id_squadra, @RequestBody Giocatori giocatori){
        giocatoriService.addGiocatore(squadreService.getSquadra(id_squadra),giocatori);
    }

    @RequestMapping(value = "/giocatore/{id}", method = RequestMethod.PUT)
    public void updateGiocatore(@PathVariable long id, @RequestBody Giocatori giocatori){
        giocatoriService.updateGiocatore(id, giocatori);
    }

    @RequestMapping(value = "/giocatori/{id}", method = RequestMethod.DELETE)
    public void deleteGiocatore(@PathVariable long id){
        giocatoriService.deleteGiocatore(id);
    }
}
