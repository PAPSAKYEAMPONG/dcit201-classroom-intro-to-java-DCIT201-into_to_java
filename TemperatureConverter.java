import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        //This allows a user to enter a value and an option
        Scanner input = new Scanner(System.in);
        System.out.println("Enter (1) for Fahrenheit to Celsius");
        System.out.println("Enter (2) for Celsius to Fahrenheit");
        int option = input.nextInt();

        if(option == 1){
            //Calculation of Fahrenheit to Celsius
            System.out.println("Your choice: Fahrenheit to Celsius");
            System.out.println("Enter a value to convert: ");
            double value = input.nextDouble();
            double finalValue = (value - 32) * 5/9;
            System.out.print("Celsius is: " + Math.round(finalValue * 10.0)/10.0 + "℃");
        }
        else if (option == 2) {
            // calculate celsius to fahrenheit
            System.out.println("Your choice: Celsius to Fahrenheit ");
            System.out.println("Enter a value to convert: ");
            double value1 = input.nextDouble();
            double finalValue1 = (value1 * 9/5) + 32;
            System.out.print("Fahrenheit is: " + Math.round(finalValue1 * 10.0)/10.0 + "℉");
        }
        else{
            System.out.println("Enter a number either 1 or 2!");
        }

    }
}
