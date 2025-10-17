package com.itau.task.service.validations;

import com.itau.task.dto.TransacaoDTO;

public interface IValidacao {

    void validar(TransacaoDTO transacao);
}
