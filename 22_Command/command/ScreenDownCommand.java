package command;

/**
 * The Command for dropping the screen - ConcreteCommand #1
 */
public class ScreenDownCommand implements Command {
	private Screen screen;

	public ScreenDownCommand(Screen screen) {
		this.screen = screen;
	}

	@Override // Command
	public void execute() {
		screen.moveDown();
	}
}
