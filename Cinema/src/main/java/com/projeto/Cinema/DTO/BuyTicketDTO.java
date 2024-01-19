package com.projeto.Cinema.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuyTicketDTO {
    private Integer idFilm;
    private Integer idSesson;
    private Integer idTimes;
    private Integer numRow;
    private Integer numSeat;
    @JsonProperty("IdCliente")
    private Integer IdCliente;

    public BuyTicketDTO() {
    }

    public BuyTicketDTO(Integer idFilm, Integer idSesson, Integer numRow, Integer numSeat, Integer idCliente) {
        this.idFilm = idFilm;
        this.idSesson = idSesson;
        this.numRow = numRow;
        this.numSeat = numSeat;
        IdCliente = idCliente;
    }

    @Override
    public String toString() {
        return "BuyTicketDTO{" +
                "idFilm=" + idFilm +
                ", idSesson=" + idSesson +
                ", numRow=" + numRow +
                ", numSeat=" + numSeat +
                ", IdCliente=" + IdCliente +
                '}';
    }

    public Integer getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(Integer idFilm) {
        this.idFilm = idFilm;
    }

    public Integer getIdSesson() {
        return idSesson;
    }

    public void setIdSesson(Integer idSesson) {
        this.idSesson = idSesson;
    }

    public Integer getIdTimes() {
        return idTimes;
    }

    public void setIdTimes(Integer idTimes) {
        this.idTimes = idTimes;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer idCliente) {
        IdCliente = idCliente;
    }

    public Integer getNumRow() {
        return numRow;
    }

    public void setNumRow(Integer numRow) {
        this.numRow = numRow;
    }

    public Integer getNumSeat() {
        return numSeat;
    }

    public void setNumSeat(Integer numSeat) {
        this.numSeat = numSeat;
    }
}
