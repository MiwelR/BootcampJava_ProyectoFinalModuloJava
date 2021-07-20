package com.example.demo.domain;

import com.example.demo.domain.pieces.AirConditioner;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.CarDoors;
import com.example.demo.domain.pieces.Engine;
import com.example.demo.domain.pieces.GasolineTank;

public class GasolineCar extends Vehicle {

	private GasolineTank gasolineTank;

	public GasolineCar() {

	}

	public GasolineCar(Long id, String manufacturer, String model, String color, AirConditioner airConditioner, Battery battery, CarDoors carDoors,
			Engine engine, GasolineTank gasolineTank) {
		super(id, manufacturer, model, color, airConditioner, battery, carDoors, engine);
		this.gasolineTank = gasolineTank;
	}

	public GasolineTank getGasolineTank() {
		return gasolineTank;
	}

	public void setGasolineTank(GasolineTank gasolineTank) {
		this.gasolineTank = gasolineTank;
	}

	@Override
	public String toString() {
		return "GasolineCar [gasolineTank=" + gasolineTank + ", getId()=" + getId() + ", getModel()=" + getModel()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getBattery()=" + getBattery() + ", getCarDoors()="
				+ getCarDoors() + ", getEngine()=" + getEngine() + ", getColor()=" + getColor() + ", getManufacturer()="
				+ getManufacturer() + "]";
	}
	
}
