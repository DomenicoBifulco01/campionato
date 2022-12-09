package it.campionato.repository;

import it.campionato.model.Giocatori;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiocatoriRepository extends JpaRepository<Giocatori, Long> {
    List<Giocatori> findAllByEta(int eta);
}
