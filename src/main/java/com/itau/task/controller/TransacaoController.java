package com.itau.task.controller;

import com.itau.task.dto.TransacaoDTO;
import com.itau.task.service.TransacaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Requisições
@RestController
// Path
@RequestMapping("/transacao")
public class TransacaoController {

    @Autowired
    private TransacaoService service;

    @PostMapping
    public void save(@RequestBody @Valid TransacaoDTO transacao) {
        service.save(transacao);
    }
}
