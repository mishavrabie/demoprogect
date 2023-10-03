package May17;

import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the circle radius");
        // Declare necesary variable to store radius, area
        double radius = input.nextDouble();

        // Get the required input (radius)from the user and store it in a variable

        // Calculate the area using the formula and store it -> area = 3.14 * radius * radius.

        double area = 3.14 * radius * radius;
        System.out.println("The area is:" + area);

    }


}
