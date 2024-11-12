package com.gateweb.amqp_consumer.usecase;

import com.gateweb.amqp_consumer.domain.CustomMsg;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class AmqpConsumerService {

    private final RabbitTemplate rabbitTemplate;

    @RabbitListener(queues = "myQueue")
    public void receiveMessage(@Payload CustomMsg message, @Header("myHeaderKey") String myHeaderKey) {
        log.debug("Received message: {}", message);
        log.debug("Received myHeaderKey: {}", myHeaderKey);
    }
}
