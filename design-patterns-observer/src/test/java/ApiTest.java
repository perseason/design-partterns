import org.junit.Test;
import pers.lilpen.design.observable.WeatherData;
import pers.lilpen.design.observer.CurrentConditionDisplay;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/13 21:58
 */
public class ApiTest {
    @Test
    public void testObserver() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1, 2, 3);
        currentConditionDisplay.display();
    }
}
