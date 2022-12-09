package it.campionato.repository;

import it.campionato.model.Squadre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SquadreRepository extends JpaRepository<Squadre, Long> {
}
