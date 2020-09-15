package com.messaging.practice.router;

import java.util.Map;
import java.util.UUID;

import com.messaging.practice.config.IMessageSender;
import com.messaging.practice.model.IMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messaging")
public class Router {
 @Autowired
 private IMessageSender sender;

 @Value("${p.jms.queue}")
 private String q;

 @PostMapping("/send")
 public String message(@RequestBody Map<String, Object> body) {
  try {
   IMessage m = new IMessage((String) body.get("message"), UUID.randomUUID());
   sender.sendIMessage(q, m);
   return m.toString();
  } catch (Exception e) {
   throw e;
  }
 }
}
