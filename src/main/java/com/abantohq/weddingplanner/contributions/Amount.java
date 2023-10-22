package com.abantohq.weddingplanner.contributions;

public class Amount {
  private Float amount;
  private ContributionDetail contributionDetail;

  public Amount(Float amount, ContributionDetail contributionDetail) {
    this.amount = amount;
    this.contributionDetail = contributionDetail;
  }

  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public ContributionDetail getContributionDetail() {
    return contributionDetail;
  }

  public void setContributionDetail(ContributionDetail contributionDetail) {
    this.contributionDetail = contributionDetail;
  }

  @Override
  public String toString() {
    return "Amount [amount=" + amount + ", contributionDetail=" + contributionDetail + "]";
  }
}
