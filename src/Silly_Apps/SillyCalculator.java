package Silly_Apps;

import com.sun.jdi.IntegerValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SillyCalculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // not very proud of this one, but at least it works... :)


        System.out.println("Hi there! Super Upper Dupper Calculator is here!");
        System.out.println("but actually you can do operations only with 2 numbers at a time... ");
        System.out.println();
        System.out.println("This is how it works: ");
        System.out.println("First, choose 1 operation you want to perform with 2 numbers:");
        System.out.println();


        boolean done = false;


        while (!done) {

            boolean wrongInput = true;
            boolean wrongInput2 = true;
            boolean repeat = true;

            System.out.println("To select Addition type in \"A\"");
            System.out.println("To select Subtraction type in \"S\"");
            System.out.println("To select Multiplication type in \"M\"");
            System.out.println("To select Division type in \"D\"");
            System.out.println();


            String operation = reader.readLine();
            System.out.println();

            while (wrongInput) {

                if (operation.equalsIgnoreCase("a") ||
                    operation.equalsIgnoreCase("s") ||
                    operation.equalsIgnoreCase("m") ||
                    operation.equalsIgnoreCase("d")
                ) {
                    wrongInput = false;

                } else {
                    System.out.println("Sorry, but Supper Upper Dupper calculator couldn't understand which operation you need....");
                    System.out.println("You have entered: \"" + operation + "\". Please select from these options: ");
                    System.out.println();
                    System.out.println("If you need Addition type in \"A\"");
                    System.out.println("If you need Subtraction type in \"S\"");
                    System.out.println("If you need Multiplication type in \"M\"");
                    System.out.println("If you need Division type in \"D\"");
                    System.out.println();

                    operation = reader.readLine();
                    System.out.println();

                    wrongInput = true;
                }

            }

            System.out.println("Now type in your first number: ");
            String one = reader.readLine();
            System.out.println();



            while (wrongInput2) {

                try {
                    double numberTry1 = Double.parseDouble(one);
                    wrongInput2 = false;

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, but you need to type in number, you have entered \"" + one + "\"");
                    System.out.println("Please type in your first number: ");
                    one = reader.readLine();
                    System.out.println();
                }
            }




            wrongInput2 = true;
            System.out.println("Now type in your second number: ");
            String two = reader.readLine();
            System.out.println();

            while (wrongInput2) {

                try {
                    double numberTry2 = Double.parseDouble(two);
                    wrongInput2 = false;

                } catch (NumberFormatException ex) {
                    System.out.println("Sorry, but you need to type in number, you have entered \"" + two + "\"");
                    System.out.println("Please type in your second number: ");
                    two = reader.readLine();
                    System.out.println();
                }
            }

                double number1 = Double.parseDouble(one);
                double number2 = Double.parseDouble(two);


                if (operation.equalsIgnoreCase("a")) {
                    addition(number1, number2);

                } else if (operation.equalsIgnoreCase("s")) {
                    subtraction(number1, number2);

                } else if (operation.equalsIgnoreCase("m")) {
                    multiplication(number1, number2);

                } else if (operation.equalsIgnoreCase("d")) {
                    division(number1, number2);
                }



                while (repeat) {

                    System.out.println("Would you like to do another operation?");
                    System.out.println("If Yes - type in \"Y\", if No - type in \"N\"");
                    String again = reader.readLine();
                    System.out.println();


                    if (again.equalsIgnoreCase("y")) {
                        done = false;
                        repeat = false;

                    } else if (again.equalsIgnoreCase("n")) {
                        done = true;
                        repeat = false;
                        System.out.println("Thank you for using Supper Upper Dupper calculator. BYE!");

                    } else {
                        System.out.println("Sorry, Supper Upper Dupper calculator didn't understand your answer: \"" + again + "\"");
                        System.out.println();
                    }

                }


            }

        }



    public static void addition(double one, double two) {

        System.out.println("Your numbers sum is: " + (one + two));
        System.out.println();

    }

    public static void subtraction(double one, double two) {

        System.out.println("Your numbers difference is: " + (one - two));
        System.out.println();

    }

    public static void multiplication(double one, double two) {

        System.out.println("Your numbers product is: " + (one * two));
        System.out.println();

    }

    public static void division(double one, double two) {

        System.out.println("Your numbers quotient is: " + (one / two));
        System.out.println();

    }

}
