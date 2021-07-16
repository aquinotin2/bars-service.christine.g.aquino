package com.accenture.bars.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Billing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "billing_id")
    private int billingId;

    @Column(name = "billing_cycle")
    private int billingCycle;

    @Column(name = "billing_month")
    private String billingMonth;

    private Double amount;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "last_edited")
    private String lastedited;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account accountId;

    public int getBillingId() {
        return billingId;
    }

    public void setBillingId(int billingId) {
        this.billingId = billingId;
    }

    public int getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(int billingCycle) {
        this.billingCycle = billingCycle;
    }

    public String getBillingMonth() {
        return billingMonth;
    }

    public void setBillingMonth(String billingMonth) {
        this.billingMonth = billingMonth;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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

    public String getLastedited() {
        return lastedited;
    }

    public void setLastedited(String lastedited) {
        this.lastedited = lastedited;
    }

    public Billing(/*int billingId*/) {
        //this.billingId.billingId;
    }

   }