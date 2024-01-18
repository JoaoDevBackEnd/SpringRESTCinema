package com.projeto.Cinema.Filmes;

import com.projeto.Cinema.DTO.ShowTimesSessionDTO;
import com.projeto.Cinema.Session.Session;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Date;

@Service
public class FilmeService {

    private final FilmeRepository filmerRepository;

    @Autowired
    public FilmeService(FilmeRepository filmerRepository) {
        this.filmerRepository = filmerRepository;
    }
   @Transactional
    public Filme registrarFIlme(Filme filme){
        return this.filmerRepository.save(filme);
    }

    @Transactional
    public Filme getById(Integer id){
        return this.filmerRepository.findById(id).orElse(null);
    }
    @Transactional
    public void generationShowTIme(ShowTimesSessionDTO dto){
        Filme filme = this.getById(dto.getIdFilm());
        for(int x=0;x < dto.getNumRoom().length;x++){
            LocalTime localtime = dto.getStartDisplay();
            LocalTime durationFilme = filme.getDurationFilme();

            for (int i = 1; i <= dto.getNumDisplay(); i++) {

                if(localtime.isAfter(dto.getEndDisplay())){
                    throw new RuntimeException("O filme :"+filme.getNomeFilme()+" ,tem a duração de: "+filme.getDurationFilme()+ ", e isso ultrapassa o limite estabelecido para uma nova sessão");
                }
                Session session = new Session();
                session.setNumRoom(dto.getNumRoom()[x]);
                session.setStartSession(localtime);
                filme.addSession(session);

                localtime = localtime.plusHours(durationFilme.getHour()).plusMinutes(durationFilme.getMinute()).plusSeconds(durationFilme.getSecond())
                        .plusHours(dto.getIntervalDisplay().getHour()).plusMinutes(dto.getIntervalDisplay().getMinute()).plusSeconds(dto.getIntervalDisplay().getSecond());

            }
        }





    }
}
