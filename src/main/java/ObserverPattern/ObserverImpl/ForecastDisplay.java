package ObserverPattern.ObserverImpl;

import ObserverPattern.Display.DisplayElement;
import ObserverPattern.Observers.Observer;
import ObserverPattern.SubjectImpl.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Forecast Conditions : temp: "+temp+" humidity: "+humidity+" prssure: "+pressure);
    }
}
