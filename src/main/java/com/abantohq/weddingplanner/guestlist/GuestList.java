package com.abantohq.weddingplanner.guestlist;

import java.util.ArrayList;
import java.util.List;

import com.abantohq.weddingplanner.guestlist.Guest;

public class GuestList {
  private List<Guest> guests;

  public GuestList() {
    guests = new ArrayList<>();
  }

  public void addGuest(String name, String email, String phoneNumber) {
    Guest newGuest = new Guest(name, email, phoneNumber);
    guests.add(newGuest);
  }

  public void removeGuest(Guest guest) {
    guests.remove(guest);
  }

  public void updateRSVPStatus(Guest guest, boolean rsvpStatus) {
    guest.updateRSVP(rsvpStatus);
  }

  public List<Guest> getGuests() {
    return guests;
  }
}

