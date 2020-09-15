package com.messaging.practice.model;

import java.util.UUID;

@SuppressWarnings("serial")
public class IMessage implements java.io.Serializable {
 private String actualMessage;
 private UUID id;

 public IMessage() {}

 public IMessage(String actualMessage, UUID id) {
  this.actualMessage = actualMessage;
  this.id = id;
 }

 public String getActualMessage() {
  return actualMessage;
 }

 public UUID getId() {
  return id;
 }

 public String toString() {
  return String.format("{ message: %s, id: %s }", getActualMessage(), getId().toString());
 }
}
