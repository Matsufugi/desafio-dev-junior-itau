package com.itau.task.service;

import com.itau.task.domain.Transacao;
import com.itau.task.dto.TransacaoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransacaoService {

    private List<Transacao> transacoes = new ArrayList<>();

    public void save(TransacaoDTO transacao) {
        transacoes.add(new Transacao(transacao.value(), transacao.dataHour()));
    }
}
