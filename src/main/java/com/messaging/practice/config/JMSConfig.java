package com.messaging.practice.config;

import org.springframework.boot.autoconfigure.jms.JmsProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

@Configuration
@EnableConfigurationProperties(JmsProperties.class)
public class JMSConfig {
 @Bean
 public MessageConverter messageConverter() {
  MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
  converter.setTargetType(MessageType.TEXT);
  converter.setTypeIdPropertyName("_class_");
  return converter;
 }
}
