package trycatch;

import java.util.LinkedList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println(" Enter x: ");
        int x = scanner.nextInt();
        System.out.println(" Enter y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.caculator(x,y);
    }
    public void caculator(int x, int y) {
        try {
            int addition = x + y;
            int subtraction = x - y;
            int multiplication = x * y;
            int division = x / y;
            System.out.println(" Addition x + y = " + addition);
            System.out.println(" Subtraction x - y = " + subtraction);
            System.out.println(" Multiplication x * y = " + multiplication);
            System.out.println(" Division x / y = " + division);
        } catch (Exception e){
            System.out.println(" An exception occurs " + e.getMessage());
        }
    }
}

