// SimpleCalculatorApplication.java
// D. Singletary
// 1/9/2024
// Template for calculator application

//Matthew R Stubbs
//1/21/2024
//added methods for each math operation and fixed typo in print out

package edu.fscj.cen3024c.simplecalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleCalculatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleCalculatorApplication.class, args);

        // Test the multiply function
        int number1 = 10; // This can be input from the user or arguments
        int number2 = 5; // This can be input from the user or arguments
        int result = multiply(number1, number2);
        System.out.println("Multiply result is: " + result);

        // Test the divide function
        result = divide(number1, number2);
        System.out.println("Divide result is: " + result);

        // Test the add function
        result = add(number1, number2);
        System.out.println("Add result is: " + result);

        // Test the subtract function
        result = subtract(number1, number2);
        System.out.println("Subtract result is: " + result);
    }

    //returns product of two ints
    static int multiply(int number1,int number2){
        return number1 * number2;
    }

    //returns quotient of two ints
    static int divide(int number1,int number2){
        if (number2 == 0){
            return 1;
        }
        return number1 / number2;
    }

    //returns sum of two ints
    static int add(int number1,int number2){
        return number1 + number2;
    }

    //returns difference of two ints
    static int subtract(int number1,int number2){
        return number1 - number2;
    }
}
