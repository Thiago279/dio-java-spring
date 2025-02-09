package io.github.Thiago279.JavaDIO.controller;

import io.github.Thiago279.JavaDIO.dto.PartidaRequestDTO;
import io.github.Thiago279.JavaDIO.model.Partida;
import io.github.Thiago279.JavaDIO.service.PartidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("partidas")
public class PartidaController {

    @Autowired
    PartidaService partidaService;

    @PostMapping
    public ResponseEntity<PartidaRequestDTO> cadastraPartida(@RequestBody PartidaRequestDTO partidaRequest){
        partidaService.savePartida(partidaRequest);
        return ResponseEntity.ok(partidaRequest);
    }
}
