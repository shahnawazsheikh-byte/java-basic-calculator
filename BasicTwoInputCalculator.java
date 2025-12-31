/*
 * Basic Two-Input Calculator
 * Author: Shahnawaz Sheikh
 * 
 * Features:
 * - Addition, subtraction, multiplication operations
 * - Division with zero-division prevention
 * - Remainder calculation with validation
 * - Interactive menu system
 * - Modular method-based design
 * 
 * Technologies: Java, Scanner for user input
 *  Last Updated: December 31, 2025
 */
import java.util.Scanner;

public class BasicTwoInputCalculator {

    //      ===welcome massage Method===
    public static void display() {
        System.out.println("=".repeat(50));
        System.out.println("        Basic Two Digit Calculator");
        System.out.println("=".repeat(50));

    }
//      ===Main Menu Method===

    public static void main_menu() {
        System.out.println("1. Add");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("0. Exit");

    }
//      ===Input Numbers===
// Frist Number

    public static double num1() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        System.out.print("Num1: ");
        double num1 = Sc.nextDouble();
        return num1;
    }
// Second Number

    public static double num2() {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Num2: ");
        double num2 = Sc.nextDouble();
        return num2;
    }

//      ==Sum Method==
    public static double sum() {
        return num1() + num2(); //  Return sum

    }
//      ===Substraction Method===

    public static double subtract() {
        return num1() - num2(); // Return Substrate

    }
//      ===Multiplication Method===

    public static double multiply() {
        return num1() * num2(); // Return Multiplication

    }
//      ====Division Method===

    public static double divide() {
        double a = num1();// input Numerator
        double b = num2();// Denominator
        while (b == 0) {    // Ensure Denominator Not Equal To 0!
            Scanner Sc = new Scanner(System.in);
            System.out.println("Denominator Can't be zero!");
            System.out.print("Enter Again!");
            b = Sc.nextDouble();
        }

        return a / b; // Return Division
    }
//      ===Finding Remainder===

    public static double Remainder() {
        return num1() % num2(); // Return Remainder

    }
/**
 * Main method - Entry point for Basic Two-Input Calculator
 * Runs the interactive calculator with arithmetic operations
 * Manages user input, operation selection, and result display
 */
    public static void main(String[] args) {
        display();

        boolean exit_program = false;
        while (!exit_program) {
            main_menu();
            Scanner Sc=new Scanner(System.in);
            System.out.print("Choice to Perform Operation: ");
            int choice = Sc.nextInt();
            if (choice == 0) {
                exit_program = true;
                System.out.println("Thank you For Using!");
                System.out.println("Have A Good Day!");

            } else if (choice == 1) {
                System.out.println("Result: " + sum());
            } else if (choice == 2) {
                System.out.println("Result: " + subtract());

            } else if (choice == 3) {
                System.out.println("Result: " + multiply());

            } else if (choice == 4) {
                System.out.println("Result: " + divide());

            } else if (choice == 5) {
                System.out.println("Remainder: " + Remainder());

            } else {
                System.out.println("Please choice between 0-5!");
            }
        }

    }
}
