package com.abantohq.weddingplanner.communications;

import com.abantohq.weddingplanner.usermanagement.Wed;

public class Announcement {
  private String message;
  private Boolean sent;
  private Wed wed;
  private Channel channel;

  public Announcement(String message, Boolean sent, Wed wed, Channel channel) {
    this.message = message;
    this.sent = sent;
    this.wed = wed;
    this.channel = channel;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Boolean getSent() {
    return sent;
  }

  public void setSent(Boolean sent) {
    this.sent = sent;
  }

  public Wed getWed() {
    return wed;
  }

  public void setWed(Wed wed) {
    this.wed = wed;
  }

  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  @Override
  public String toString() {
    return "Announcement [message=" + message + ", sent=" + sent + ", wed=" + wed + ", channel=" + channel + "]";
  }
}
