package com.itau.task.service.validations.impl;

import com.itau.task.dto.TransacaoDTO;
import com.itau.task.exceptions.ValorNegativoException;
import com.itau.task.service.validations.IValidacao;
import org.springframework.stereotype.Component;

@Component
public class ValidarValorNegativoImpl implements IValidacao {

    @Override
    public void validar(TransacaoDTO request) {
        boolean ehNumeroNegativo = request.value() < 0;

        if (ehNumeroNegativo) {
            throw new ValorNegativoException("Não é permitido valor negativo!");
        }
    }
}
