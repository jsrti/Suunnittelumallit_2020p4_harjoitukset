package adapter;

public class WeatherStation implements TemperatureMeasurable {

	private double measurement = 55.2;

	@Override
	public double getTemperature() {
		return measurement;
	}

}
