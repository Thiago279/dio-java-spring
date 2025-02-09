package io.github.Thiago279.JavaDIO.service;

import io.github.Thiago279.JavaDIO.dto.PartidaRequestDTO;
import io.github.Thiago279.JavaDIO.model.Partida;
import io.github.Thiago279.JavaDIO.model.Time;

import java.util.List;

public interface PartidaService {
    void atualizarTabela(Partida partida);
    List<Partida> findAll();

    void atualizaGolsTime(Partida partida , Time time);

    void atribuiPontos(Partida partida, Time time1, Time time2);

    void savePartida(PartidaRequestDTO partidaRequestDTO);
}
