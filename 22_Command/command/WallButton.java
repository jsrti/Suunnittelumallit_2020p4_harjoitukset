package command;

/** Invoker */
public class WallButton {
	Command command;

	public WallButton(Command cmd) {
		command = cmd;
	}

	public void push() {
		command.execute();
	}
}
