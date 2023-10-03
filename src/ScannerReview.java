import java.util.Scanner;

public class ScannerReview {

    public         static        void main(String[] args) {
//visibility     // static- belong to class  // void - this method dose not return anything
        // Scanner class is used for getting user input

        Scanner scanner = new Scanner(System.in);
        //get the rectangle sides from the user
        //Give a prompt

        System.out.println("Enter the height");
        double height = scanner.nextDouble();

        // Give the width
        System.out.println("Give the width");
        double width = scanner.nextDouble() ;

        // Calculate the area

        double area = height * width ;

        System.out.println("The area of a rectangle:" + area);

        // Display the area





    }



}
