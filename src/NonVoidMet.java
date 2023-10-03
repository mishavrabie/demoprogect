public class NonVoidMet {
    public static void main(String[] args) {

       double returnedValue = getAreaofRectangle(3,4);
// The result of a non void method can be stored in a variable and used later in main method
        System.out.println(returnedValue);

        System.out.println(getAreaofRectangle(5,6));

    }
    public static double getAreaofRectangle(double width , double hight){

        double result = width * hight ;


       return result;


    }


}

