package ObserverPattern;

import ObserverPattern.ObserverImpl.CurrentConditionsDisplay;
import ObserverPattern.ObserverImpl.ForecastDisplay;
import ObserverPattern.ObserverImpl.StatisticsDisplay;
import ObserverPattern.SubjectImpl.WeatherData;

public class WeatherStation {
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        System.out.println("I am in WeatherStation setting measurements and update my subscribers");
        weatherData.setMeasurements(23,56,100);
        weatherData.setMeasurements(46,78,29);
        weatherData.setMeasurements(17,23,571);
    }
}
