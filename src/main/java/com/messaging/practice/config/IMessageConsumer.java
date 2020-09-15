package com.messaging.practice.config;

import com.messaging.practice.model.IMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class IMessageConsumer {
 @JmsListener(destination = "${p.jms.queue}")
 public void processMessage(IMessage message) {
  System.out.println(message.toString());
 }
}
