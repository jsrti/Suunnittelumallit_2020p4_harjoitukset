package command;

/**
 * The Command for raising the screen - ConcreteCommand #2
 */
public class ScreenUpCommand implements Command {
	private Screen screen;

	public ScreenUpCommand(Screen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.moveUp();
	}
}
