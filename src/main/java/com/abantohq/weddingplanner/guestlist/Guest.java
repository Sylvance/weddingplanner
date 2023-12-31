package com.abantohq.weddingplanner.guestlist;

public class Guest {
  private String name;
  private String email;
  private String phoneNumber;
  private boolean rsvpStatus;

  public Guest(String name, String email, String phoneNumber, boolean rsvpStatus) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.rsvpStatus = rsvpStatus;
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

  public boolean isRsvpStatus() {
    return rsvpStatus;
  }

  public void setRsvpStatus(boolean rsvpStatus) {
    this.rsvpStatus = rsvpStatus;
  }

  @Override
  public String toString() {
    return "Guest [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", rsvpStatus=" + rsvpStatus
        + "]";
  }
}
