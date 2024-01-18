package com.projeto.Cinema.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.Duration;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
public class ShowTimesSessionDTO {
    private Integer idFilm;
    private LocalTime startDisplay;
    private LocalTime endDisplay;
    private LocalTime intervalDisplay;
    private Integer numDisplay;
    private Integer numRoom[];

    public Integer[] getNumRoom() {
        return numRoom;
    }

    public void setNumRoom(Integer[] numRoom) {
        this.numRoom = numRoom;
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public LocalTime getStartDisplay() {
        return startDisplay;
    }

    public void setStartDisplay(int hours,int minutes , int seconds) {
        this.startDisplay = LocalTime.of(hours,minutes,seconds);
    }

    public LocalTime getEndDisplay() {
        return endDisplay;
    }

    public void setEndDisplay(int hours,int minutes , int seconds) {
        this.endDisplay = LocalTime.of(hours,minutes,seconds);
    }

    public LocalTime getIntervalDisplay() {
        return intervalDisplay;
    }

    public void setIntervalDisplay(int hours,int minutes , int seconds) {
        this.intervalDisplay = LocalTime.of(hours,minutes,seconds);
    }

    public Integer getNumDisplay() {
        return numDisplay;
    }

    public void setNumDisplay(Integer numDisplay) {
        this.numDisplay = numDisplay;
    }
}