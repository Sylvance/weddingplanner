package com.abantohq.weddingplanner.communications;

public class Channel {
  private String name;
  private String location;
  private ChannelType channelType;

  public Channel(String name, String location, ChannelType channelType) {
    this.name = name;
    this.location = location;
    this.channelType = channelType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public ChannelType getChannelType() {
    return channelType;
  }

  public void setChannelType(ChannelType channelType) {
    this.channelType = channelType;
  }

  @Override
  public String toString() {
    return "Channel [name=" + name + ", location=" + location + ", channelType=" + channelType + "]";
  }
}
