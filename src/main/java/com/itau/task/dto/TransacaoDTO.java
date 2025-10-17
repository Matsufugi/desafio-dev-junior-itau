package com.itau.task.dto;

import java.time.OffsetDateTime;

public record TransacaoDTO (
        Double value,
        OffsetDateTime dataHour
) {}
