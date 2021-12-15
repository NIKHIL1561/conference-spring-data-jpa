package com.pluralsight.conferencedemo.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "time_slots")
public class TimeSlot {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "time_slot_id")
	private Long timeSlotId;

	@Column(name = "time_slot_date")
	private Date timeSlotDate;

	@Column(name = "start_time")
	private Timestamp startTime;

	@Column(name = "end_time")
	private Timestamp endTime;

	@Column(name = "is_keynote_time_slot")
	private boolean isKeyNoteTimeSlot;

	public Long getTimeSlotId() {
		return timeSlotId;
	}

	public void setTimeSlotId(Long timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public Date getTimeSlotDate() {
		return timeSlotDate;
	}

	public void setTimeSlotDate(Date timeSlotDate) {
		this.timeSlotDate = timeSlotDate;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public boolean isKeyNoteTimeSlot() {
		return isKeyNoteTimeSlot;
	}

	public void setKeyNoteTimeSlot(boolean isKeyNoteTimeSlot) {
		this.isKeyNoteTimeSlot = isKeyNoteTimeSlot;
	}
}
