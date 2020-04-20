package adapter;

public class Main {

	public static void main(String[] args) {
		TemperatureMeasurable weatherStation = new WeatherStation();
		TemperatureMeasurableAdapter weatherStationAdapter = new TemperatureMeasurableAdapterImpl(weatherStation);
		
		System.out.println("Original measurement (F): " + weatherStation.getTemperature());
		System.out.println("Measurement using adapter (C): " +weatherStationAdapter.getTemperature());
	}

}
