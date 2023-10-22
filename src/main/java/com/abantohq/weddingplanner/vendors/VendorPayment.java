package com.abantohq.weddingplanner.vendors;

public class VendorPayment {
  private Vendor vendor;
  private Float amount;
  private VendorPaymentDetail vendorPaymentDetail;
  private VendorInvoice vendorInvoice;

  public VendorPayment(Vendor vendor, Float amount, VendorPaymentDetail vendorPaymentDetail,
      VendorInvoice vendorInvoice) {
    this.vendor = vendor;
    this.amount = amount;
    this.vendorPaymentDetail = vendorPaymentDetail;
    this.vendorInvoice = vendorInvoice;
  }

  public Vendor getVendor() {
    return vendor;
  }

  public void setVendor(Vendor vendor) {
    this.vendor = vendor;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public VendorPaymentDetail getVendorPaymentDetail() {
    return vendorPaymentDetail;
  }

  public void setVendorPaymentDetail(VendorPaymentDetail vendorPaymentDetail) {
    this.vendorPaymentDetail = vendorPaymentDetail;
  }

  public VendorInvoice getVendorInvoice() {
    return vendorInvoice;
  }

  public void setVendorInvoice(VendorInvoice vendorInvoice) {
    this.vendorInvoice = vendorInvoice;
  }

  @Override
  public String toString() {
    return "VendorPayment [vendor=" + vendor + ", amount=" + amount + ", vendorPaymentDetail=" + vendorPaymentDetail
        + ", vendorInvoice=" + vendorInvoice + "]";
  }
}
