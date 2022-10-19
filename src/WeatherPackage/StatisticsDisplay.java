package WeatherPackage;

import BeanObserver.BeansObserver;
import BeanObserver.Observable;
import BeanObserver.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;
    Observable observable;
    Observer anObserver = new BeansObserver() {
    @Override
    public void update(Observable source, Object weatherdata) {
         WeatherData data = (WeatherData)weatherdata;
         float temp = data.getTemperature();
         tempSum += temp;
         numReadings++;

	if (temp > maxTemp) {
            maxTemp = temp;
	}
 
	if (temp < minTemp) {
		minTemp = temp;
	}

	display();
    }
        };

    public StatisticsDisplay(Observable weatherData) {
	this.observable = weatherData;
		weatherData.addObserver(anObserver);
    }

    public void display() {
	System.out.println("Temperature: " + "\n   Minimum: " + minTemp + " F" + "\n   Average: " + (tempSum / numReadings) + " F"
			+ "\n   Maximum: " + maxTemp + " F");
    }

    @Override
    public void update(Observable source, Object data) {
        
    }
}
