package com.abantohq.weddingplanner.guestlist;

public class Guest {
  private String name;
  private String email;
  private String phoneNumber;
  private boolean rsvpStatus;

  public Guest(String name, String email, String phoneNumber) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.rsvpStatus = false;
  }

  public void updateRSVP(boolean status) {
    this.rsvpStatus = status;
  }

  @Override
  public String toString() {
    return "Guest{" +
      "name='" + name + '\'' +
      ", email='" + email + '\'' +
      ", phoneNumber='" + phoneNumber + '\'' +
      ", rsvpStatus=" + rsvpStatus +
      '}';
    }
}
