package com.infotech.book.ticket.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketIdInteger;
	
	@Column(name="passenger_name", nullable = false)
	private String passengerName;
	
	@Column(name = "booking_date")
	private Date bookingDate;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="dest_station")
	private String destStationString;
	
	@Column(name="email")
	private String email;

	public Integer getTicketIdInteger() {
		return ticketIdInteger;
	}

	public void setTicketIdInteger(Integer ticketIdInteger) {
		this.ticketIdInteger = ticketIdInteger;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestStationString() {
		return destStationString;
	}

	public void setDestStationString(String destStationString) {
		this.destStationString = destStationString;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
