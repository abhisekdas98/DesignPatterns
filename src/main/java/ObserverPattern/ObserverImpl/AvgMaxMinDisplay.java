package ObserverPattern.ObserverImpl;

import ObserverPattern.Display.DisplayElement;
import ObserverPattern.Observers.Observer;
import ObserverPattern.SubjectImpl.WeatherData;

import java.util.List;

import static java.sql.Types.DOUBLE;

public class AvgMaxMinDisplay implements Observer, DisplayElement {
    private float temp;

    private  double avgTemp;
    private  double maxTemp = Double.MIN_VALUE;
    private  double minTemp = Double.MAX_VALUE;
    private  double sumTemp;
    private  double counter;
    private WeatherData weatherData;

    public AvgMaxMinDisplay(WeatherData weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("MaxTemp : "+ maxTemp +" MinTemp : "+minTemp+"AvgTemp : "+ avgTemp);
    }

    @Override
    public void update() {
       this.temp = weatherData.getTemp();
        counter++;
        sumTemp +=this.temp;
        avgTemp = sumTemp / counter ;
        if(temp>maxTemp)
            maxTemp = temp;
        if(temp<minTemp)
            minTemp = temp;
        display();

    }
}
