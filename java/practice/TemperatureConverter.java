public class TemperatureConverter {
    public double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double toKelvin(double celsius) {
        return celsius + 273.15;
    }

    public double toCelsiusFromKelvin(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        // Convert Celsius to Fahrenheit
        double fahrenheit = converter.toFahrenheit(20);
        System.out.println("20 degrees Celsius in Fahrenheit: " + fahrenheit);

        // Convert Fahrenheit to Celsius
        double celsius = converter.toCelsius(68);
        System.out.println("68 degrees Fahrenheit in Celsius: " + celsius);

        // Convert Celsius to Kelvin
        double kelvin = converter.toKelvin(25);
        System.out.println("25 degrees Celsius in Kelvin: " + kelvin);

        // Convert Kelvin to Celsius
        double celsiusFromKelvin = converter.toCelsiusFromKelvin(298);
        System.out.println("298 Kelvin in Celsius: " + celsiusFromKelvin);
    }
}
