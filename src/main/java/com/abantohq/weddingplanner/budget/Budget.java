package com.abantohq.weddingplanner.budget;

public class Budget {
  private String name;
  private String description;
  private Float amount;
  private BudgetDetail budgetDetail;

  public Budget(String name, String description, Float amount, BudgetDetail budgetDetail) {
    this.name = name;
    this.description = description;
    this.amount = amount;
    this.budgetDetail = budgetDetail;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public BudgetDetail getBudgetDetail() {
    return budgetDetail;
  }

  public void setBudgetDetail(BudgetDetail budgetDetail) {
    this.budgetDetail = budgetDetail;
  }

  @Override
  public String toString() {
    return "Budget [name=" + name + ", description=" + description + ", amount=" + amount + ", budgetDetail="
        + budgetDetail + "]";
  }
}
