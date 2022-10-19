package WeatherPackage;

import BeanObserver.BeansObservable;
import BeanObserver.Observable;

public class WeatherData implements Observable{
	private float temperature;
	private float humidity;
	private float pressure;
    Observable observable;
	
	public WeatherData() {
            observable = new BeansObservable();
	}
        
    @Override
    public void addObserver(BeanObserver.Observer observer) {
        observable.addObserver(observer);
    }

    @Override
    public void removeObserver(BeanObserver.Observer observer) {
        observable.removeObserver(observer);
    }

    @Override
    public void notifyObservers(Object data) {
        observable.notifyObservers(data);
    }
    public void measurementsChanged() {
        observable.notifyObservers(this);
	
    }
	
    public void setMeasurements(float temperature, float humidity, float pressure) {
	this.temperature = temperature;
	this.humidity = humidity;
	this.pressure = pressure;
	measurementsChanged();
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
    
}
