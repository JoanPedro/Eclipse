package br.com.joanpedro.pattern.command;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Switcher {
	public List<Command> commands;

	public Switcher() {
		this.commands = new ArrayList<Command>();
	}

	public void addCommand(Command command) {
		this.commands.add(command);
	}

	public void executeCommands() {
		this.commands.forEach(command -> command.execute());
	}

}
