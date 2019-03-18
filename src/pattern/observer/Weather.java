package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {

    private WeatherType currentWeather;
    private List<WeatherObserver> observers;

    public Weather () {
        observers = new ArrayList<WeatherObserver>();
        currentWeather = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver observer){
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer){
        if (observers == null){
            return;
        }
        observers.remove(observer);
    }

    public void timePasses(){
        WeatherType[] enumsValue = WeatherType.values();
        currentWeather = enumsValue[(currentWeather.ordinal() + 1) % enumsValue.length];
        notifyObserver();
    }

    private void notifyObserver(){
        for (WeatherObserver obs :  observers){
            obs.update(currentWeather);
        }
    }

}
