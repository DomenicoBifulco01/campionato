package it.campionato.model;

import jakarta.persistence.*;

@Entity
@Table
public class Squadre {

    @Id
    @GeneratedValue
    private long id;

    private String nomeSquadra;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "idSquadra")

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public void setNomeSquadra(String nomeSquadra) {
        this.nomeSquadra = nomeSquadra;
    }
}
