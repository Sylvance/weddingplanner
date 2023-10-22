package com.abantohq.weddingplanner.giftregistry;

public class Gift {
  private String name;
  private String urlLocation;
  private String phoneNumber;
  private boolean isReserved;
  private Double price;
  private Double funds;

  public Gift(String name, String urlLocation, String phoneNumber, boolean isReserved, Double price, Double funds) {
    this.name = name;
    this.urlLocation = urlLocation;
    this.phoneNumber = phoneNumber;
    this.isReserved = isReserved;
    this.price = price;
    this.funds = funds;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrlLocation() {
    return urlLocation;
  }

  public void setUrlLocation(String urlLocation) {
    this.urlLocation = urlLocation;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public boolean isReservedisReserved() {
    return isReserved;
  }

  public void setReservedisReserved(boolean isReserved) {
    this.isReserved = isReserved;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Double getFunds() {
    return funds;
  }

  public void setFunds(Double funds) {
    this.funds = funds;
  }

  @Override
  public String toString() {
    return "Gift [name=" + name + ", urlLocation=" + urlLocation + ", phoneNumber=" + phoneNumber + ", isReserved="
        + isReserved + ", price=" + price + ", funds=" + funds + "]";
  }
}
