package com.projeto.Cinema.Assento;

import com.projeto.Cinema.Enity.EnityID;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.time.LocalTime;

@Entity(name="Assento")
public class Assento extends EnityID {


    @Column(name="fileira")
    private Integer fileira;
    @Column(name="assento")
    private Integer assento;
    @Column(name="horario")
    private LocalTime horario;

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Integer getFileira() {
        return fileira;
    }

    public void setFileira(Integer fileira) {
        this.fileira = fileira;
    }

    public Integer getAssento() {
        return assento;
    }

    public void setAssento(Integer assento) {
        this.assento = assento;
    }
}
