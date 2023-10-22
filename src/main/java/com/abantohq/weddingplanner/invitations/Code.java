package com.abantohq.weddingplanner.invitations;

import java.util.ArrayList;

public class Code {
  private InvitationImage image;
  private Boolean generated;
  private ArrayList<Usage> usage;

  public Code(InvitationImage image, Boolean generated, ArrayList<Usage> usage) {
    this.image = image;
    this.generated = generated;
    this.usage = usage;
  }

  public InvitationImage getImage() {
    return image;
  }

  public void setImage(InvitationImage image) {
    this.image = image;
  }

  public Boolean getGenerated() {
    return generated;
  }

  public void setGenerated(Boolean generated) {
    this.generated = generated;
  }

  public ArrayList<Usage> getUsage() {
    return usage;
  }

  public void setUsage(ArrayList<Usage> usage) {
    this.usage = usage;
  }

  @Override
  public String toString() {
    return "Code [image=" + image + ", generated=" + generated + ", usage=" + usage + "]";
  }
}
