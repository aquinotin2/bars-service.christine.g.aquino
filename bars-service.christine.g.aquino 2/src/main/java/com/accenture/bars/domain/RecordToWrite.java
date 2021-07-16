package com.accenture.bars.domain;

import java.time.LocalDate;
import java.util.List;

public class RecordToWrite {

    private List<RecordToWrite> record;
    private Integer billingCycle;
    private LocalDate startDate;
    private LocalDate endDate;
    private String accountName;
    private String fName;
    private String lName;
    private double amount;

    public List<RecordToWrite> getRecord() {
        return record;
    }

    public void setRecord(List<RecordToWrite> record) {
        this.record = record;
    }

    public Integer getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(Integer billingCycle) {
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

    public RecordToWrite(/*List<RecordToWrite>*/) {
        //this.record = record;
    }

}
