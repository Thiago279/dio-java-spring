package io.github.Thiago279.JavaDIO.service.impl;

import io.github.Thiago279.JavaDIO.model.Time;
import io.github.Thiago279.JavaDIO.repository.TimeRepository;
import io.github.Thiago279.JavaDIO.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeServiceImpl implements TimeService {

    @Autowired
    TimeRepository timeRepository;

    @Override
    public void saveTime(Time time) {
        timeRepository.save(time);

        ;
    }

    @Override
    public List<Time> findAll() {
        return timeRepository.findAll();
    }


}
