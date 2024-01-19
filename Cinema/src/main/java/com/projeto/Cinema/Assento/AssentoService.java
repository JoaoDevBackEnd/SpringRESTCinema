package com.projeto.Cinema.Assento;

import com.projeto.Cinema.DTO.GenerateSeatsDTO;
import com.projeto.Cinema.Filmes.Filme;
import com.projeto.Cinema.Filmes.FilmeRepository;
import com.projeto.Cinema.Filmes.FilmeService;
import com.projeto.Cinema.Session.Session;
import com.projeto.Cinema.Session.SessionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class AssentoService {
    private  final AssentoRepository assentoRepository;
    private final SessionRepository sessionRepository;
    public AssentoService(AssentoRepository assentoRepository, FilmeRepository filmeRepository, FilmeService filmeService, SessionRepository sessionRepository) {
        this.assentoRepository = assentoRepository;

        this.sessionRepository = sessionRepository;
    }


    @Transactional
    public void generateSeats(GenerateSeatsDTO dto){


        }
    }
}
