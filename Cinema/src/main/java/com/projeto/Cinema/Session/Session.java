package com.projeto.Cinema.Session;

import com.projeto.Cinema.Assento.Assento;
import com.projeto.Cinema.Enity.EnityID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="SessionRoom")
public class Session extends EnityID {

    @Column(name="numberRoom")
    private Integer numRoom;
    @Column(name="startSession")
    private LocalTime startSession;

    @OneToMany
    @JoinColumn(name="ID_ROOM")
    private List<Assento> assentos=new ArrayList<>();



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
    public void addSession(Assento assento){
        assentos.add(assento);
    }
}
