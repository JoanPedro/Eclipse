package br.com.joanpedro.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

	private double pressure;
	private double temperature;
	private double humidity;
	private List<Observer> observerList;

	public WeatherStation() {
		this.observerList = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		this.observerList.add(o);

	}

	@Override
	public void removeObserver(Observer o) {
		this.observerList.remove(o);

	}

	@Override
	public void notifyAllObservers() {
		observerList.forEach(observer -> {
			observer.update(this.pressure, this.temperature, this.humidity);
		});

	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
		this.notifyAllObservers();
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
		this.notifyAllObservers();
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		this.notifyAllObservers();
	}

}
