package May17;

import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // create a Scanner object

        System.out.println("Please enter a 1st number:");
        int number1 = input.nextInt();

        System.out.println("Please enter a 2nd number:");
        int number2 = input.nextInt();

        System.out.println(" You entered number 1: " + number1 );
        System.out.println("You entered number 2:" + number2 );
    }



}
