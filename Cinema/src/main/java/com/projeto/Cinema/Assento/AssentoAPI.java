package com.projeto.Cinema.Assento;

import com.projeto.Cinema.DTO.GenerateSeatsDTO;
import com.projeto.Cinema.DTO.ShowTimesSessionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name="/assento")
public class AssentoAPI {
    private final AssentoService assentoService;

    public AssentoAPI(AssentoService assentoService) {
        this.assentoService = assentoService;
    }
    @PostMapping(name="/cadastrarAssento")
    public ResponseEntity gerarsessao(@RequestBody GenerateSeatsDTO dto){
        this.assentoService.generateSeats(dto);
        return ResponseEntity.ok().build();
    }

}
