package com.projeto.Cinema.Enity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter

public class EnityID {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected   Integer id;
}
