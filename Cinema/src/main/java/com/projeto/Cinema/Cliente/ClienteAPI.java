package com.projeto.Cinema.Cliente;

import com.projeto.Cinema.DTO.BuyTicketDTO;
import com.projeto.Cinema.Filmes.Filme;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comprar")
public class ClienteAPI {
    private final ClienteService clienteService;


    public ClienteAPI(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @PostMapping("/cadastrarCliente")
    public ResponseEntity<Cliente> cadastrar(@RequestBody Cliente cliente){
        return ResponseEntity.ok(this.clienteService.registrarCliente(cliente));
    }
    @PostMapping("/ComprarTicket")
    public ResponseEntity comprarTicket(@RequestBody BuyTicketDTO buyTicketDTO){
        System.out.println("Recebido BuyTicketDTO: " + buyTicketDTO.toString());

        try {
            this.clienteService.comprarAssento(buyTicketDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            System.err.println("Erro ao comprar assento: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
