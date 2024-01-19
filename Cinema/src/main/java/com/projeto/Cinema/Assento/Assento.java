package com.projeto.Cinema.Assento;

import com.projeto.Cinema.Cliente.Cliente;
import com.projeto.Cinema.Enity.EnityID;
import com.projeto.Cinema.Session.Session;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalTime;

@Entity(name="Assento")
public class Assento extends EnityID {
    @Column(name="fileira")
    private Integer fileira;
    @Column(name="assento")
    private Integer assento;
    @Column(name="horario")
    private LocalTime horario;
    @ManyToOne
    @JoinColumn(name = "ID_ROOM")
    private Session room;

    @ManyToOne
    @JoinColumn(name="Id_Cliente")
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Session getRoom() {
        return room;
    }

    public void setRoom(Session room) {
        this.room = room;
    }

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
