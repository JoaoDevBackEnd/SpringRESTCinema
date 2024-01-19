package com.projeto.Cinema.Session;

import com.projeto.Cinema.Assento.Assento;
import com.projeto.Cinema.Enity.EnityID;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "SessionRoom")
public class Session extends EnityID {

    @Column(name = "numberRoom")
    private Integer numRoom;

    @Column(name = "startSession")
    private LocalTime startSession;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Assento> assentos = new ArrayList<>();

    public Integer getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(Integer numRoom) {
        this.numRoom = numRoom;
    }

    public LocalTime getStartSession() {
        return startSession;
    }

    public void setStartSession(LocalTime startSession) {
        this.startSession = startSession;
    }

    public List<Assento> getAssentos() {
        return assentos;
    }

    public void criarAssentos(int numFileiras, int assentosPorFileira) {
        for (int fileira = 1; fileira <= numFileiras; fileira++) {
            for (int assento = 1; assento <= assentosPorFileira; assento++) {
                Assento novoAssento = new Assento();
                novoAssento.setHorario(this.getStartSession());
                novoAssento.setFileira(fileira);
                novoAssento.setAssento(assento);
                novoAssento.setRoom(this);
                this.addAssento(novoAssento);
            }
        }
    }

    public void addAssento(Assento assento) {
        assentos.add(assento);
        assento.setRoom(this);
    }
}

