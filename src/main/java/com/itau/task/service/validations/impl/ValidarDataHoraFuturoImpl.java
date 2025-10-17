package com.itau.task.service.validations.impl;

import com.itau.task.dto.TransacaoDTO;
import com.itau.task.exceptions.TransacaoFuturoException;
import com.itau.task.service.validations.IValidacao;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class ValidarDataHoraFuturoImpl implements IValidacao {

    @Override
    public void validar(TransacaoDTO request) {
        boolean ehDepois = request.dataHour().isAfter(OffsetDateTime.now());

        if (ehDepois) {
            throw new TransacaoFuturoException("Valor do campo dataHora está no futuro!");
        }
    }
}
