package com.projeto.Cinema.Cliente;

import com.projeto.Cinema.Assento.Assento;
import com.projeto.Cinema.Assento.AssentoRepository;
import com.projeto.Cinema.DTO.BuyTicketDTO;
import com.projeto.Cinema.Filmes.Filme;
import com.projeto.Cinema.Session.Session;
import com.projeto.Cinema.Session.SessionRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;
    private final SessionRepository sessionRepository;
    private final AssentoRepository assentoRepository;
    @Autowired
    public ClienteService(ClienteRepository clienteRepository, SessionRepository sessionRepository, AssentoRepository assentoRepository) {
        this.clienteRepository = clienteRepository;
        this.sessionRepository = sessionRepository;
        this.assentoRepository = assentoRepository;
    }
    @Transactional
    public Cliente registrarCliente(Cliente cliente){
        return this.clienteRepository.save(cliente);
    }

    @Transactional
    public Cliente getById(Integer id){
        if (id == null) {
            throw new IllegalArgumentException("ID do cliente não pode ser nulo");
        }
        return this.clienteRepository.findById(id).orElse(null);
    }
    @Transactional
    public void comprarAssento(BuyTicketDTO buyTicketDTO) {

        Cliente cliente = this.getById(buyTicketDTO.getIdCliente());
        System.out.println("Cliente encontrado: " + cliente);
        Session session = sessionRepository.findById(buyTicketDTO.getIdSesson()).orElseThrow(() -> new RuntimeException("Sessão não encontrada"));

        Assento assento = assentoRepository.findAssentoBySessionAndFileiraAndAssento(session, buyTicketDTO.getNumRow(), buyTicketDTO.getNumSeat());
        if (assento == null) {
            throw new RuntimeException("Assento não disponível");
        }
        assento.setCliente(cliente);
        assentoRepository.save(assento);
    }
}
