package com.itau.task.service.validations.impl;

import com.itau.task.dto.TransacaoDTO;
import com.itau.task.exceptions.CamposInvalidosException;
import com.itau.task.service.validations.IValidacao;
import org.springframework.stereotype.Component;

// Para o Spring injetar no seu próprio contexto
@Component
public class ValidarCamposPreenchidosImpl implements IValidacao {

    @Override
    public void validar(TransacaoDTO transacao) {
        if(transacao.value() == null || transacao.dataHour() == null) {
            throw new CamposInvalidosException("Campos de valor ou data e hora não preenchidos corretamente.");
        }
    }
}
