package it.campionato.service;

import it.campionato.model.Giocatori;
import it.campionato.model.Squadre;
import it.campionato.repository.GiocatoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GiocatoriServiceImpl implements GiocatoriService{
    @Autowired
    private GiocatoriRepository giocatoriRepository;
    @Override
    public List<Giocatori> getAllGiocatori() {
        return giocatoriRepository.findAll();
    }

    @Override
    public Giocatori getGiocatore(Long id) {
        Optional<Giocatori> giocatore = this.giocatoriRepository.findById(id);
        if(giocatore.isPresent()){
            return giocatore.get();
        }
        else {
            return null;
        }
    }

    @Override
    public void addGiocatore(Squadre squadre, Giocatori giocatori) {
        giocatori.setSquadra(squadre);
        giocatoriRepository.save(giocatori);
    }

    @Override
    public void updateGiocatore(Long id, Giocatori giocatori) {
        giocatori.setId(id);
        giocatoriRepository.save(giocatori);
    }

    @Override
    public void deleteGiocatore(Long id) {
        giocatoriRepository.deleteById(id);
    }

    @Override
    public List<Giocatori> findGiocatoriByEta(int eta){
        return giocatoriRepository.findAllByEta(eta);
    }
}
