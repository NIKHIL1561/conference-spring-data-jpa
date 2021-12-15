package com.pluralsight.conferencedemo.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pluralsight.conferencedemo.models.TicketPrice;
import com.pluralsight.conferencedemo.models.TicketType;

public interface TicketTypeJpaRepository extends JpaRepository<TicketType, String> {
	List<TicketType> findByIncludesWorkshopTrue();
}
