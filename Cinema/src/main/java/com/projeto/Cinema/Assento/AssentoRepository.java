package com.projeto.Cinema.Assento;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.projeto.Cinema.Session.Session;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AssentoRepository extends JpaRepository<Assento,Integer>{
    @Query("SELECT a FROM Assento a WHERE a.room = :session AND a.fileira = :fileira AND a.assento = :assento")
    Assento findAssentoBySessionAndFileiraAndAssento(
            @Param("session") Session session,
            @Param("fileira") Integer fileira,
            @Param("assento") Integer assento
    );
}
