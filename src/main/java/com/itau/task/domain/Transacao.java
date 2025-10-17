package com.itau.task.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Transacao {
    Double value;
    OffsetDateTime dataHour;
}
