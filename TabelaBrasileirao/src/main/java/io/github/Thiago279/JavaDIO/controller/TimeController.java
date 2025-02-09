package io.github.Thiago279.JavaDIO.controller;

import io.github.Thiago279.JavaDIO.model.Time;
import io.github.Thiago279.JavaDIO.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("times")
public class TimeController {

    @Autowired
    TimeService timeService;
    @PostMapping
    public ResponseEntity<Time> cadastrarTime(@RequestBody Time time){

        timeService.saveTime(time);
        return ResponseEntity.ok(time);

    }

    @GetMapping
    public ResponseEntity<List<Time>> retornaTimes(){
        var times  = timeService.findAll();
        return ResponseEntity.ok(times);
    }
}
