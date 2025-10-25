package com.itau.task.controller;

import com.itau.task.dto.TransacaoDTO;
import com.itau.task.service.TransacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

// Requisições
@RestController
// Path
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    // Retorno com o corpo da requisição
    //@PostMapping
    //public ResponseEntity<TransacaoDTO> save(@RequestBody @Valid TransacaoDTO transacao) {
    //    TransacaoDTO saved = service.save(transacao);
    //    return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    //}

    // Retorno sem o corpo da requisição
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TransacaoDTO> save(@RequestBody @Valid TransacaoDTO transacao) {
        TransacaoDTO saved = service.save(transacao);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void delete() {
        service.delete();
    }

    @GetMapping
    public ResponseEntity<List<TransacaoDTO>> buscarTodasTransacoes() {
        List<TransacaoDTO> transacoes = service.buscarTransacoes();
        return ResponseEntity.ok(transacoes);
    }

}
