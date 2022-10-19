package WeatherPackage;

import BeanObserver.BeansObserver;
import BeanObserver.Observable;
import BeanObserver.Observer;
public class CurrentConditionsDisplay implements  Observer,DisplayElement {
	private float temperature;
	private float humidity;
        Observable observable;
        Observer anObserver = new BeansObserver(){
            @Override
            public void update(Observable source, Object weatherData) {
                System.out.println("-------------------------");
                WeatherData data = (WeatherData)weatherData;
                temperature = data.getTemperature();
		humidity = data.getHumidity();
		display();
            }
        };
	
	public CurrentConditionsDisplay(Observable weatherData) {
		this.observable = weatherData;
		weatherData.addObserver(anObserver);
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

    @Override
    public void update(Observable source, Object data) {
        
    }
   
}
