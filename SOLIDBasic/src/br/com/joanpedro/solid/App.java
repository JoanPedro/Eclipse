package br.com.joanpedro.solid;

import br.com.joanpedro.solid.liskov.ElectricCar;
import br.com.joanpedro.solid.liskov.ElectricVehicle;
import br.com.joanpedro.solid.liskov.Vehicle;

public class App {

	public static void main(String[] args) {
		ElectricVehicle car = new ElectricCar();
		
		car.chargeBattery();
	}
}
