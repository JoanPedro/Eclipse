package br.com.joanpedro.pattern.observer;

public class App {
	public static void main(String[] args) {

		WeatherStation station = new WeatherStation();
		new WeatherObserver(station);
		new WeatherObserver2(station);

		station.setHumidity(100);
		station.setPressure(200);
		station.setTemperature(33);
	}
}
