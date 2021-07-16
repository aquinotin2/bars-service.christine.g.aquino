package com.accenture.bars.domain;

import java.time.LocalDate;

public class Record {
    private int billingCycle;
    private LocalDate startDate;
    private LocalDate endDate;
    private String accountName;
    private String fName;
    private String lName;
    private double amount;

    public int getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(int billingCycle) {
        this.billingCycle = billingCycle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Record(/*int billingCycle*/) {
        //this.billingCycle = billingCycle;
    }


}
