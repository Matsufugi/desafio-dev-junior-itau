package com.itau.task.service;

import com.itau.task.domain.Transacao;
import com.itau.task.dto.TransacaoDTO;
import com.itau.task.service.validations.IValidacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {

    private final List<Transacao> transacoes = new ArrayList<>();
    private final List<IValidacao> validacoes;

    public TransacaoService(List<IValidacao> validacoes) {
        this.validacoes = validacoes;
    }

    public void save(TransacaoDTO transacao) {
        //**
        //  Faz com que os dados recebidos passem primeiro por todas as validações desenvolvidas, caso ele não passe em
        //  uma delas ele não será adicionado.
        // */
        validacoes.forEach( v -> v.validar(transacao));

        transacoes.add(new Transacao(transacao.value(), transacao.dataHour()));
    }
}
