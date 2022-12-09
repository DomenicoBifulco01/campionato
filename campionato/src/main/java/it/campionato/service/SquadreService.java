package it.campionato.service;

import it.campionato.model.Squadre;

import java.util.List;

public interface SquadreService {
    public List<Squadre> getAllSquadre();

    public Squadre getSquadra(Long id);
}
