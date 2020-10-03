package br.com.joanpedro.pattern.observer;

public class WeatherObserver implements Observer {
	private double pressure;
	private double temperature;
	private double humidity;
	private Subject subject;

	public WeatherObserver(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}

	@Override
	public void update(double pressure, double temperature, double humidity) {
		this.pressure = pressure;
		this.temperature = temperature;
		this.humidity = humidity;

		showData();
	}

	private void showData() {
		System.out.println("OBSERVER 1:");
		System.out.println(
				"Pressure: " + this.pressure + " Temperature: " + this.temperature + " Humidity: " + this.humidity);
	}

}
