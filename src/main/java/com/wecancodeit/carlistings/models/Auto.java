package com.wecancodeit.carlistings.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Auto {
	
	@Id
	@GeneratedValue
	private Long id;
	private String vin;
	private String make;
	private String model;
	private String color;
	private String mileage;
	private int price;

	public Auto(String make, String model, String color, String mileage, int price) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.mileage = mileage;
		this.price = price;
	}

	
	public Long getId() {
		return id;
	}
	

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getMileage() {
		return mileage;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Auto [make=" + make + ", model=" + model + ", color=" + color + ", mileage=" + mileage + ", price="
				+ price + "]";
	}


	public String getVin() {
		return vin;
	}



}
