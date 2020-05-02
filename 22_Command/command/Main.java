package command;

public class Main {

	public static void main(String[] args) {
		Screen screen = new Screen();
		Command screenDown = new ScreenDownCommand(screen);
		Command screenUp = new ScreenUpCommand(screen);
		WallButton button1 = new WallButton(screenDown);
		WallButton button2 = new WallButton(screenUp);
		button1.push();
		button2.push();
	}

}
