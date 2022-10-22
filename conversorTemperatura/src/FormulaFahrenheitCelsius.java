public class FormulaFahrenheitCelsius {
    static double converteCelciusParaFahrenheit(double celsius) {
        double fahrenheit = (9 * celsius) / 5 + 32;
        return fahrenheit;
    }
    static double converteFahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    static double converteCelsiusParaKelvin(double celsius) {
        return celsius + 273.0;
    }

    static double converteKelvinParaCelsius(double kelvin) {
        return kelvin - 273.0;
    }

    static double converteFahrenheitParaKelvin(double fahrenheit) {
        return ((fahrenheit - 32.0) * (5.0 / 9.0)) + 273.0;
    }

    static double converteKelvinParaFahrenheit(double kelvin) {
        return (9.0 / 5.0) * (kelvin - 273.0) + 32.0;
    }
}
