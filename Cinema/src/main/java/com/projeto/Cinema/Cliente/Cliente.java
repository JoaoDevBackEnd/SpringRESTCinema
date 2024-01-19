package com.projeto.Cinema.Cliente;

import com.projeto.Cinema.Assento.Assento;
import com.projeto.Cinema.Enity.EnityID;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "Cliente")
public class Cliente extends EnityID {
    @Column(name = "nome")
    private String nome;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Assento> assentos = new ArrayList<>();
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
