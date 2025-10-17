package com.itau.task.service.validations.impl;

import com.itau.task.dto.TransacaoDTO;
import com.itau.task.exceptions.ValorNegativoException;
import com.itau.task.service.validations.IValidacao;
import org.springframework.stereotype.Component;

@Component
public class ValidarValorNegativoImpl implements IValidacao {

    @Override
    public void validar(TransacaoDTO transacao) {

        Boolean isNegative = transacao.value() < 0;

        if (isNegative) {
            throw new ValorNegativoException("A transação mínima é de R$1,00.");
        }
    }
}
