package com.abantohq.weddingplanner.invitations;

import com.abantohq.weddingplanner.guestlist.Guest;

public class Invitation {
  private Guest guest;
  private Boolean sent;
  private Boolean accepted;
  private Code invitationCode;

  public Invitation(Guest guest, Boolean sent, Boolean accepted, Code invitationCode) {
    this.guest = guest;
    this.sent = sent;
    this.accepted = accepted;
    this.invitationCode = invitationCode;
  }

  public Guest getGuest() {
    return guest;
  }

  public Boolean getSent() {
    return sent;
  }

  public Boolean getAccepted() {
    return accepted;
  }

  public Code getInvitationCode() {
    return invitationCode;
  }

  public void setGuest(Guest guest) {
    this.guest = guest;
  }

  public void setSent(Boolean sent) {
    this.sent = sent;
  }

  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }

  public void setInvitationCode(Code invitationCode) {
    this.invitationCode = invitationCode;
  }

  @Override
  public String toString() {
    return "Invitation [guest=" + guest + ", sent=" + sent + ", accepted=" + accepted + ", invitationCode="
        + invitationCode + "]";
  }
}
