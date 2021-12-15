package com.pluralsight.conferencedemo.models;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pluralsight.conferencedemo.repositories.TimeSlotJpaRepository;

@SpringBootTest
public class TimeSlotTest {

	@Autowired
	private TimeSlotJpaRepository jpaRepository;
	
	@Test
	public void testBeforeSlotDate() {
		Date beforeSlotDate = new Date(2020,04,10);
		List<TimeSlot> timeSlots = jpaRepository.findByTimeSlotDateBefore(beforeSlotDate);
		System.out.println(timeSlots.get(0).getStartTime());
		
	}
}
