package june9;

public class howToCheckequalityof2numbers {
    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 0.5;
        double difrence = num1 -num2;
        double limit = 0.0001;
        System.out.println(difrence);

        if(Math.abs(difrence)<limit){
            System.out.println ("equal");

        }else {
            System.out.println("Not Equal");
        }
    }


}
