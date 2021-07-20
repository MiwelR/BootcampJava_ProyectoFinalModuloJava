package com.example.demo.domain;

import com.example.demo.domain.pieces.AirConditioner;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.CarDoors;

public abstract class Vehicle {

	private Long id;
	private String manufacturer;
	private String model;
	private String color;
	private AirConditioner airConditioner;
	private Battery battery;
	private CarDoors carDoors;
	private Engine engine;
	
	public Vehicle() {
		
	}

	public Vehicle(Long id, String manufacturer, String model, String color, AirConditioner airConditioner, Battery battery, CarDoors carDoors,
			Engine engine) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
		this.airConditioner = airConditioner;
		this.battery = battery;
		this.carDoors = carDoors;
		this.engine = engine;
		this.airConditioner.start();
		this.battery.start();
		this.engine.start();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public AirConditioner getAirConditioner() {
		return airConditioner;
	}
	public void setAirConditioner(AirConditioner airConditioner) {
		this.airConditioner = airConditioner;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	public CarDoors getCarDoors() {
		return carDoors;
	}
	public void setCarDoors(CarDoors carDoors) {
		this.carDoors = carDoors;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", color=" + color
				+ ", airConditioner=" + airConditioner + ", battery=" + battery + ", carDoors=" + carDoors + ", engine="
				+ engine + "]";
	}
	
}
