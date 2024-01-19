package com.projeto.Cinema.Filmes;

import com.projeto.Cinema.DTO.ShowTimesSessionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filme")
public class FilmeAPI {

    private final FilmeService filmeService;

    public FilmeAPI(FilmeService filmeService) {
        this.filmeService = filmeService;
    }

    @PostMapping("/cadastrarFilme")
    public ResponseEntity<Filme> cadastrar(@RequestBody Filme filme){
        return ResponseEntity.ok(this.filmeService.registrarFIlme(filme));
    }
    @PostMapping("/GenerateSession")
    public ResponseEntity gerarsessao(@RequestBody ShowTimesSessionDTO dto){
        this.filmeService.generationShowTime(dto);
        return ResponseEntity.ok().build();
    }
}
