package io.github.Thiago279.JavaDIO.service.impl;

import io.github.Thiago279.JavaDIO.model.Time;
import io.github.Thiago279.JavaDIO.repository.TimeRepository;
import io.github.Thiago279.JavaDIO.service.TabelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class TabelaServiceImpl implements TabelaService {

    @Autowired
    TimeRepository timeRepository;

    @Override
    public List<Time> exibirTabela() {
        List<Time> tabela = timeRepository.findAll().stream().
                sorted(Comparator.comparing(Time::getPontos).reversed())
                .toList();

        return tabela;
    }
}
