package com.abantohq.weddingplanner.contributions;

import java.util.Date;

public class ContributionDetail {
  private String email;
  private String phoneNumber;
  private Float amount;
  private String transactionId;
  private Date transactionDate;

  public ContributionDetail(String email, String phoneNumber, Float amount, String transactionId,
      Date transactionDate) {
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.amount = amount;
    this.transactionId = transactionId;
    this.transactionDate = transactionDate;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public Date getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }

  @Override
  public String toString() {
    return "ContributionDetail [email=" + email + ", phoneNumber=" + phoneNumber + ", amount=" + amount
        + ", transactionId=" + transactionId + ", transactionDate=" + transactionDate + "]";
  }
}
