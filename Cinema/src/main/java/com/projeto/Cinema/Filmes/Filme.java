package com.projeto.Cinema.Filmes;

import com.projeto.Cinema.Enity.EnityID;
import com.projeto.Cinema.Session.Session;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Entity(name="filmes")
public class Filme extends EnityID {

    @Column(name="nomeFilme")
    private String nomeFilme;
    @Column(name = "durationFilme")
    private LocalTime durationFilme;
    @Column(name ="dataExhibition")
    private String dataExhibition;
    @Column(name="endData")
    private String endData;

    public String getDataExhibition() {
        return dataExhibition;
    }

    public void setDataExhibition(String dataExhibition) {
        this.dataExhibition = dataExhibition;
    }

    public String getEndData() {
        return endData;
    }

    public void setEndData(String endData) {
        this.endData = endData;
    }

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="filme_id")
    private List<Session> sessionList = new ArrayList<>();

    public List<Session> getSessionList() {
        return sessionList;
    }

    public void setSessionList(List<Session> sessionList) {
        this.sessionList = sessionList;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public LocalTime getDurationFilme() {
        return durationFilme;
    }

    public void setDurationFilme(LocalTime hora) {
        this.durationFilme = hora;
    }

    public void addSession(Session session){
        sessionList.add(session);
    }

}
