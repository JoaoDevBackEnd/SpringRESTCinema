package com.projeto.Cinema.Session;

import com.projeto.Cinema.Enity.EnityID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="SessionRoom")
public class Session extends EnityID {

    @Column(name="numberRoom")
    private Integer numRoom;
    @Column(name="startSession")
    private LocalTime startSession;


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
}
