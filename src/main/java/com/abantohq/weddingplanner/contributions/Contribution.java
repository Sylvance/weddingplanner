package com.abantohq.weddingplanner.contributions;

import com.abantohq.weddingplanner.guestlist.Guest;

public class Contribution {
  private Guest guest;
  private Boolean isReceived;
  private Boolean isPledged;
  private Amount amount;

  public Contribution(Guest guest, Boolean isReceived, Boolean isPledged, Amount amount) {
    this.guest = guest;
    this.isReceived = isReceived;
    this.isPledged = isPledged;
    this.amount = amount;
  }

  public Guest getGuest() {
    return guest;
  }

  public void setGuest(Guest guest) {
    this.guest = guest;
  }

  public Boolean getIsReceived() {
    return isReceived;
  }

  public void setIsReceived(Boolean isReceived) {
    this.isReceived = isReceived;
  }

  public Boolean getIsPledged() {
    return isPledged;
  }

  public void setIsPledged(Boolean isPledged) {
    this.isPledged = isPledged;
  }

  public Amount getAmount() {
    return amount;
  }

  public void setAmount(Amount amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "Contribution [guest=" + guest + ", isReceived=" + isReceived + ", isPledged=" + isPledged + ", amount="
        + amount + "]";
  }
}
