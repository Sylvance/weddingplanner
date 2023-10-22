package com.abantohq.weddingplanner.timeline;

import java.util.HashSet;

public class Timeline {
  private String name;
  private HashSet<Milestone> milestone;

  public Timeline(String name, HashSet<Milestone> milestone) {
    this.name = name;
    this.milestone = milestone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HashSet<Milestone> getMilestone() {
    return milestone;
  }

  public void setMilestone(HashSet<Milestone> milestone) {
    this.milestone = milestone;
  }

  @Override
  public String toString() {
    return "Timeline [name=" + name + ", milestone=" + milestone + "]";
  }
}
