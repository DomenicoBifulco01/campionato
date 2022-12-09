package it.campionato.service;

import it.campionato.model.Squadre;
import it.campionato.repository.SquadreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SquadreServiceImpl implements SquadreService{
    @Autowired
    private SquadreRepository squadreRepository;

    @Override
    public List<Squadre> getAllSquadre() {
        return squadreRepository.findAll();
    }

    @Override
    public Squadre getSquadra(Long id) {
        Optional<Squadre> squadre= this.squadreRepository.findById(id);
        if(squadre.isPresent()){
            return squadre.get();
        }
        else {
            return null;
        }
    }
}
