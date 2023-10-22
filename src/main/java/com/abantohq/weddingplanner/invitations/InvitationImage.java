package com.abantohq.weddingplanner.invitations;

import java.util.HashMap;

public class InvitationImage {
  private String location;
  private HashMap<String, String> metadata;

  public InvitationImage(String location, HashMap<String, String> metadata) {
    this.location = location;
    this.metadata = metadata;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public HashMap<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(HashMap<String, String> metadata) {
    this.metadata = metadata;
  }

  @Override
  public String toString() {
    return "InvitationImage [location=" + location + ", metadata=" + metadata + "]";
  }
}
