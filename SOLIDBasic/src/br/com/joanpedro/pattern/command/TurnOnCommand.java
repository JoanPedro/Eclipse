package br.com.joanpedro.pattern.command;

public class TurnOnCommand implements Command {
	private Light light;

	public TurnOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.turnOn();
	}
}
