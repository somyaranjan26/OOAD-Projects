package WeatherPackage;

import BeanObserver.BeansObserver;
import BeanObserver.Observable;
import BeanObserver.Observer;

public class ForecastDisplay implements Observer,DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	Observable observable;
        Observer anObserver = new BeansObserver() {
            @Override
            public void update(Observable source, Object weatherData){
                WeatherData data = (WeatherData)weatherData;
                lastPressure = currentPressure;
				currentPressure = data.getPressure();
                display();
            }
        };

	public ForecastDisplay(Observable weatherData) {
		this.observable = weatherData;
		weatherData.addObserver(anObserver);
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

    @Override
    public void update(Observable source, Object data) {
        
    }

  
}
