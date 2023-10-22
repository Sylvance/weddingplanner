package com.abantohq.weddingplanner.invitations;

import java.util.Date;
import java.util.HashMap;

public class Usage {
  private Date when;
  private HashMap<String, String> metadata;

  public Usage(Date when, HashMap<String, String> metadata) {
    this.when = when;
    this.metadata = metadata;
  }

  public Date getWhen() {
    return when;
  }

  public void setWhen(Date when) {
    this.when = when;
  }

  public HashMap<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(HashMap<String, String> metadata) {
    this.metadata = metadata;
  }

  @Override
  public String toString() {
    return "Usage [when=" + when + ", metadata=" + metadata + "]";
  }
}
