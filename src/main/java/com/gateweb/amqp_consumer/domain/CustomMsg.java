package com.gateweb.amqp_consumer.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomMsg {

    String customMessage;

    BigDecimal amount;

    LocalDateTime timestamp;

}
