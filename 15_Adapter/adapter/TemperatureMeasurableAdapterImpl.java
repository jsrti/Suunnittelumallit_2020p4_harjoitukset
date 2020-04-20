package adapter;

public class TemperatureMeasurableAdapterImpl implements TemperatureMeasurableAdapter {

	private TemperatureMeasurable device;
	
	public TemperatureMeasurableAdapterImpl(TemperatureMeasurable device) {
		this.device = device;
	}
	
	@Override
	public double getTemperature() {
		return convertFahrenheitToCelcius(device.getTemperature());
	}
	
	private double convertFahrenheitToCelcius(double fahrenheit) {
		return (fahrenheit-32)/1.8;
	}

}
