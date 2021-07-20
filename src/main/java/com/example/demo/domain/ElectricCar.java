package com.example.demo.domain;

import com.example.demo.domain.pieces.AirConditioner;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.CarDoors;
import com.example.demo.domain.pieces.ChargingPort;
import com.example.demo.domain.pieces.Engine;

public class ElectricCar extends Vehicle {

	private ChargingPort chargingPort;

	public ElectricCar() {

	}

	public ElectricCar(Long id, String manufacturer, String model, String color, AirConditioner airConditioner, Battery battery, CarDoors carDoors,
			Engine engine, ChargingPort chargingPort) {
		super(id, manufacturer, model, color, airConditioner, battery, carDoors, engine);
		this.chargingPort = chargingPort;
	}

	public ChargingPort getChargingPort() {
		return chargingPort;
	}

	public void setChargingPort(ChargingPort chargingPort) {
		this.chargingPort = chargingPort;
	}

	@Override
	public String toString() {
		return "ElectricCar [chargingPort=" + chargingPort + ", getId()=" + getId() + ", getModel()=" + getModel()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getBattery()=" + getBattery() + ", getCarDoors()="
				+ getCarDoors() + ", getEngine()=" + getEngine() + ", getColor()=" + getColor() + ", getManufacturer()="
				+ getManufacturer() + "]";
	}
	
}
