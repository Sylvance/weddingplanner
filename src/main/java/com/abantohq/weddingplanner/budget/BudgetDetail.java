package com.abantohq.weddingplanner.budget;

import java.util.Date;
import java.util.HashSet;

import com.abantohq.weddingplanner.vendors.VendorPayment;

public class BudgetDetail {
  private Float expectedAmount;
  private Date expectedDueDate;
  private Float amountPaid;
  private Date completedOnDate;
  private HashSet<VendorPayment> payments;

  public BudgetDetail(Float expectedAmount, Date expectedDueDate, Float amountPaid, Date completedOnDate,
      HashSet<VendorPayment> payments) {
    this.expectedAmount = expectedAmount;
    this.expectedDueDate = expectedDueDate;
    this.amountPaid = amountPaid;
    this.completedOnDate = completedOnDate;
    this.payments = payments;
  }

  public Float getExpectedAmount() {
    return expectedAmount;
  }

  public void setExpectedAmount(Float expectedAmount) {
    this.expectedAmount = expectedAmount;
  }

  public Date getExpectedDueDate() {
    return expectedDueDate;
  }

  public void setExpectedDueDate(Date expectedDueDate) {
    this.expectedDueDate = expectedDueDate;
  }

  public Float getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(Float amountPaid) {
    this.amountPaid = amountPaid;
  }

  public Date getCompletedOnDate() {
    return completedOnDate;
  }

  public void setCompletedOnDate(Date completedOnDate) {
    this.completedOnDate = completedOnDate;
  }

  public HashSet<VendorPayment> getPayments() {
    return payments;
  }

  public void setPayments(HashSet<VendorPayment> payments) {
    this.payments = payments;
  }

  @Override
  public String toString() {
    return "BudgetDetail [expectedAmount=" + expectedAmount + ", expectedDueDate=" + expectedDueDate + ", amountPaid="
        + amountPaid + ", completedOnDate=" + completedOnDate + ", payments=" + payments + "]";
  }
}
