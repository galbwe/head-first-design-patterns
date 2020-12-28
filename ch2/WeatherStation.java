package ch2;
import java.util.ArrayList;
import java.util.List;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(87, 68, 20);
        weatherData.setMeasurements(89, 72, 42);
        weatherData.setMeasurements(92, 60, 34);
    }
}


interface Subject {
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObservers();
}

interface Observer {
    public void update();
}

interface DisplayElement {
    public void display();
}

class WeatherData implements Subject {
    private List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }

    public void notifyObservers() {
        for(Observer obs : observers) {
            obs.update();
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public void measurementsChanged() {
        this.notifyObservers();
    }
}

class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
        this.weatherData = weatherData;
    }

    public void update() {
        this.temperature = this.weatherData.getTemperature();
        this.humidity = this.weatherData.getHumidity();
        this.display();
    }

    public void display() {
        System.out.println("------------------------------------");
        System.out.println("Humidity: " + this.humidity);
        System.out.println("Temperature: " + this.temperature);
        System.out.println("------------------------------------");
    }
}

// class StatisticsDisplay implements Observer, DisplayElement {
    // Subject subject;
// }

// class ForecastDisplay implements Observer, DisplayElement {
    // Subject subject;
// }

