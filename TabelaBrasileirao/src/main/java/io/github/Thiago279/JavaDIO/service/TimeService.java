package io.github.Thiago279.JavaDIO.service;

import io.github.Thiago279.JavaDIO.model.Time;
import java.util.List;

public interface TimeService {

    public void saveTime(Time time);
    public List<Time> findAll();
}
