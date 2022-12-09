package it.campionato.service;

import it.campionato.model.Giocatori;
import it.campionato.model.Squadre;

import java.util.List;

public interface GiocatoriService {
    public List<Giocatori> getAllGiocatori();
    public Giocatori getGiocatore(Long id);
    public void addGiocatore(Squadre squadre, Giocatori giocatori);
    public void updateGiocatore(Long id, Giocatori giocatori);
    public void deleteGiocatore(Long id);

    public List<Giocatori> findGiocatoriByEta(int eta);

}
