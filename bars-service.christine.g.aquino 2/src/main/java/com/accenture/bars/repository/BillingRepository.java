package com.accenture.bars.repository;

import com.accenture.bars.entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;

public interface BillingRepository extends JpaRepository <BillingRepository, Longi{

    @Query (value = "SELECT * FROM bars_db WHERE accountID = ?1", nativeQuery = true)

    Billing findByBillingCycleAndStartDateAndEndDate(int BillingCycle, LocalDate startDate, LocalDate endDate);


}
