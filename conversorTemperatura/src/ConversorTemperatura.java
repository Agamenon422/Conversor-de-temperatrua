import java.util.Locale;
import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        try {
            System.out.println();
            System.out.print("*** BEM VINDO AO CONVERSOR DE TEMPERATRURA ***\n\n");
            System.out.println("------------------- MENU -------------------");
            System.out.println("1 - Converter de Fahrenheit para Celsius!");
            System.out.println("2 - Converter de Fahrenheit para Kelvin");
            System.out.println("3 - Converter de Celsius para Fahrenheit!");
            System.out.println("4 - Converter de Celsius para Kelvin!");
            System.out.println("5 - Converter de Kelvin para Fahrenheit!");
            System.out.println("6 - Converter de Kelvin para Celsius!");
            System.out.println("0 - Sair!");
            System.out.println("____________________________________________");

            boolean validacao = true;
            int num = input.nextInt();

            do {
                if (num == 1) {
                    System.out.print("Digite valor em Fahrenheit: ");
                    double fahrenheit = input.nextDouble();
                    System.out.printf("Temperatura em Celcius é: %.2fºC!%n", FormulaFahrenheitCelsius.converteFahrenheitParaCelsius(fahrenheit));
                    break;
                } else if (num == 2) {
                    System.out.print("Digite valor em Fahrenheit: ");
                    double fahrenheit = input.nextDouble();
                    System.out.printf("Temperatura em Kelvin é: %.2fºK!%n", FormulaFahrenheitCelsius.converteFahrenheitParaKelvin(fahrenheit));
                    break;
                } else if (num == 3) {
                    System.out.println("Digite valor em Celsius: ");
                    double celsius = input.nextDouble();
                    System.out.printf("Temperatura em Fahrenheit é: %.2fºF!%n", FormulaFahrenheitCelsius.converteCelciusParaFahrenheit(celsius));
                    break;

                }else if (num == 4) {
                    System.out.println("Digite valor em Celsius: ");
                    double celsius = input.nextDouble();
                    System.out.printf("Temperatura em Kelvin é: %.2fºK!%n", FormulaFahrenheitCelsius.converteCelsiusParaKelvin(celsius));
                    break;

                }
                else if (num == 5) {
                    System.out.println("Digite valor em Kelvin: ");
                    double kelvin = input.nextDouble();
                    System.out.printf("Temperatura em Fahrenheit é: %.2fºF!%n", FormulaFahrenheitCelsius.converteKelvinParaFahrenheit(kelvin));
                    break;
                }
                else if (num == 6) {
                    System.out.println("Digite valor em Kelvin: ");
                    double kelvin = input.nextDouble();
                    System.out.printf("Temperatura em Celsius é: %.2fºC!%n", FormulaFahrenheitCelsius.converteKelvinParaCelsius(kelvin));
                    break;
                }
                else if (num == 0) {
                    System.out.println("Fim!");
                    validacao = false;

                } else  {
                    System.out.println("Opçao invalida! :(");
                    break;
                }
            } while (validacao);
        }catch (Exception exception){
            System.out.println("Por favor, use uma vígula no lugar do ponto :(");
        }
    }
}
