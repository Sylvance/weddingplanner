package com.abantohq.weddingplanner.vendors;

public class Vendor {
  private String name;
  private String email;
  private String phoneNumber;
  private String service;
  private String location;

  public Vendor(String name, String email, String phoneNumber, String service, String location) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.service = service;
    this.location = location;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  @Override
  public String toString() {
    return "Vendor [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", service=" + service
        + ", location=" + location + "]";
  }
}
