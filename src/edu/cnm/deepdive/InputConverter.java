package edu.cnm.deepdive;

import java.util.Scanner;

public class InputConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running;
        
        running = true;
        while (running) {
            String userInput;
            
            System.out.println("Enter a temperature in degreed Celsius (blank to quit).");
            userInput = input.nextLine();
            if (userInput.length() > 0) {
                double celsius;
                
                celsius = Double.parseDouble(userInput);
                System.out.print("Temperature in degrees Fahrenheit = ");
                System.out.println(celsiusToFahrenheit(celsius));
            } else {
                running = false;
            }
        }
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        
        fahrenheit = celsius * 9 / 5 + 32;
        
        return fahrenheit;
    }
}
