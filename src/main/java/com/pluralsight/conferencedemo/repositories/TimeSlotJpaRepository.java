package com.pluralsight.conferencedemo.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.TimeSlot;

public interface TimeSlotJpaRepository extends JpaRepository<TimeSlot, Long>{
	List<TimeSlot> findByTimeSlotDateBefore(Date beforeSlotDate);
}
