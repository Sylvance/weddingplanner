package com.abantohq.weddingplanner.savings;

import com.abantohq.weddingplanner.usermanagement.Wed;

public class Saving {
  private Wed wed;
  private Boolean isReceived;
  private Boolean isPledged;
  private Installment amount;

  public Saving(Wed wed, Boolean isReceived, Boolean isPledged, Installment amount) {
    this.wed = wed;
    this.isReceived = isReceived;
    this.isPledged = isPledged;
    this.amount = amount;
  }

  public Wed getWed() {
    return wed;
  }

  public void setWed(Wed wed) {
    this.wed = wed;
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

  public Installment getAmount() {
    return amount;
  }

  public void setAmount(Installment amount) {
    this.amount = amount;
  }

  @Override
  public String toString() {
    return "Saving [wed=" + wed + ", isReceived=" + isReceived + ", isPledged=" + isPledged + ", amount="
        + amount + "]";
  }
}
