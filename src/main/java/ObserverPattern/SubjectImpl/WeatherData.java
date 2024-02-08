package ObserverPattern.SubjectImpl;

import ObserverPattern.Observers.Observer;
import ObserverPattern.Subject.Subject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
        {
            //observer.update(this.temp,this.humidity,this.pressure);
            // changed the update method without param to pull by observers from the Subject which will be more convenient design pattern
            observer.update();
        }
    }

    public void measurementsChanged()
    {
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity,float pressure)
    {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
