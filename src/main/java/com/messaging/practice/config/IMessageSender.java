package com.messaging.practice.config;

import com.messaging.practice.model.IMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class IMessageSender {
 private static final Logger LOGGER = LoggerFactory.getLogger(IMessageSender.class);

 @Autowired
 private JmsTemplate jmsTemplate;

 public void sendIMessage(String destination, IMessage message) {
  LOGGER.info("Sending message = '{}' to destination '{}'", message, destination);
  jmsTemplate.convertAndSend(destination, message);
 }
}
