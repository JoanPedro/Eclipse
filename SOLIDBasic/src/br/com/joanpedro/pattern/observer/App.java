package br.com.joanpedro.pattern.observer;

public class App {
	public static void main(String[] args) {

		WeatherStation station = new WeatherStation();
		WeatherObserver observer = new WeatherObserver(station);
		WeatherObserver2 observer2 = new WeatherObserver2(station);

		station.setHumidity(100);
		station.setPressure(200);
		station.setTemperature(33);
	}
}
