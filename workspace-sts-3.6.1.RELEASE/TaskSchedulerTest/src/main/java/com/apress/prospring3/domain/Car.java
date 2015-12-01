package com.apress.prospring3.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="car")
public class Car {
	private Long id;
	private String licensePlate;
	private String manufacturer;
	private DateTime manufactureDate;
	private int age;
	private int version;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}
	@Column(name = "LICENSE PLATE")
	public String getLicensePlate() {
		return licensePlate;
	}
	@Column(name = "MANUFACTURER")
	public String getManufacturer() {
		return manufacturer;
	}

}
