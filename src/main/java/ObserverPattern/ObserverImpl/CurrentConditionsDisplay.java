package ObserverPattern.ObserverImpl;

import ObserverPattern.Display.DisplayElement;
import ObserverPattern.Observers.Observer;
import ObserverPattern.SubjectImpl.WeatherData;

public class CurrentConditionsDisplay implements Observer , DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : temp: "+temp+" humidity: "+humidity+" prssure: "+pressure);
    }
}
