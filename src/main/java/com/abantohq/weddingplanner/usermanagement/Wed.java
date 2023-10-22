package com.abantohq.weddingplanner.usermanagement;

public class Wed {
  private String name;
  private String email;
  private String phoneNumber;
  private WedRole role;

  public Wed(String name, String email, String phoneNumber, WedRole role) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.role = role;
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

  public WedRole getRole() {
    return role;
  }

  public void setRole(WedRole role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Wed [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", role=" + role + "]";
  }
}
