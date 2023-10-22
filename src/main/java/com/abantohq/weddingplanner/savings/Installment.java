package com.abantohq.weddingplanner.savings;

public class Installment {
  private Float amount;
  private SavingDetail savingDetail;

  public Installment(Float amount, SavingDetail savingDetail) {
    this.amount = amount;
    this.savingDetail = savingDetail;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public SavingDetail getSavingDetail() {
    return savingDetail;
  }

  public void setSavingDetail(SavingDetail savingDetail) {
    this.savingDetail = savingDetail;
  }

  @Override
  public String toString() {
    return "Installment [amount=" + amount + ", savingDetail=" + savingDetail + "]";
  }
}
