package com.abantohq.weddingplanner.timeline;

import java.util.Date;

public class Milestone {
  private String name;
  private String details;
  private Boolean isDone;
  private Date date;

  public Milestone(String name, String details, Boolean isDone, Date date) {
    this.name = name;
    this.details = details;
    this.isDone = isDone;
    this.date = date;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public Boolean getIsDone() {
    return isDone;
  }

  public void setIsDone(Boolean isDone) {
    this.isDone = isDone;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Milestone [name=" + name + ", details=" + details + ", isDone=" + isDone + ", date=" + date + "]";
  }
}
