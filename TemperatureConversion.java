package Day6;

public class TemperatureConversion {
    float CelsiusToFahrenHeit(float temp){
        return (temp * (9/5)) +32;
    }
    float FahrenheitToCelsius(float temp){
        return (temp - 32) * 5/9;
    }
    public static void main(String[] args) {
        TemperatureConversion tc = new TemperatureConversion();
        System.out.println(tc.CelsiusToFahrenHeit(1));
        System.out.println(tc.FahrenheitToCelsius(33.8f));
    }
}
