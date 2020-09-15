package com.messaging.practice.config;

import com.messaging.practice.model.IMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class IMessageConsumer {
 private static final Logger LOGGER = LoggerFactory.getLogger(IMessageConsumer.class);

 @JmsListener(destination = "${p.jms.queue}")
 public void processMessage(IMessage message) {
  LOGGER.info("Processing Message: '{}' ", message);
 }
}
