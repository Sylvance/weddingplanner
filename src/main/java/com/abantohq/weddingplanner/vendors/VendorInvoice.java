package com.abantohq.weddingplanner.vendors;

import java.util.Date;

public class VendorInvoice {
  private String name;
  private String documentUrl;
  private Float amount;
  private Boolean hasVendorSignature;
  private Boolean hasClientSignature;
  private Date deadline;
  private Date date;

  public VendorInvoice(String name, String documentUrl, Float amount, Boolean hasVendorSignature,
      Boolean hasClientSignature, Date deadline, Date date) {
    this.name = name;
    this.documentUrl = documentUrl;
    this.amount = amount;
    this.hasVendorSignature = hasVendorSignature;
    this.hasClientSignature = hasClientSignature;
    this.deadline = deadline;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public Boolean getHasVendorSignature() {
    return hasVendorSignature;
  }

  public void setHasVendorSignature(Boolean hasVendorSignature) {
    this.hasVendorSignature = hasVendorSignature;
  }

  public Boolean getHasClientSignature() {
    return hasClientSignature;
  }

  public void setHasClientSignature(Boolean hasClientSignature) {
    this.hasClientSignature = hasClientSignature;
  }

  public Date getDeadline() {
    return deadline;
  }

  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "VendorInvoice [name=" + name + ", documentUrl=" + documentUrl + ", amount=" + amount
        + ", hasVendorSignature=" + hasVendorSignature + ", hasClientSignature=" + hasClientSignature + ", deadline="
        + deadline + ", date=" + date + "]";
  }
}
