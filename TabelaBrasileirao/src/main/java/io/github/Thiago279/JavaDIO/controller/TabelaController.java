package io.github.Thiago279.JavaDIO.controller;

import io.github.Thiago279.JavaDIO.model.Time;
import io.github.Thiago279.JavaDIO.service.TabelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tabela")
public class TabelaController {

    @Autowired
    TabelaService tabelaService;
    @GetMapping
    public ResponseEntity<List<Time>> exibirTabela(){
        return ResponseEntity.ok(tabelaService.exibirTabela());
    }
}
