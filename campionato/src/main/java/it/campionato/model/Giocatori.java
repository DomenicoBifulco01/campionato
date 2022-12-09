package it.campionato.model;

import jakarta.persistence.*;

@Entity
@Table
public class Giocatori {

    @Id
    @GeneratedValue
    private long id;

    private String nome;
    private String cognome;
    private int eta;

    @ManyToOne
    @JoinColumn(name = "idSquadra", insertable = true, updatable = false, nullable = true)
    private Squadre squadra;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public Squadre getSquadra() {
        return squadra;
    }

    public void setSquadra(Squadre squadra) {
        this.squadra = squadra;
    }
}
