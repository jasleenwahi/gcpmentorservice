package com.knoldus.assignmentmanagement.repository;

import com.knoldus.assignmentmanagement.model.KipKupPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalTime;

public interface KipKupPlanRepository extends JpaRepository<KipKupPlan, Integer> {
}
