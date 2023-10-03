package ClasTask;

public class ShalowGrandma {

    public static void main(String[] args) {
        // call your method and print out its returned value

        System.out.println(isEligibleToDate(26, 700000, 5.9));
        System.out.println(isEligibleToDate(22, 1000000, 10));
        System.out.println(isEligibleToDate(27, 50000, 9.2));

    }

    //create your method here
    public static boolean isEligibleToDate(int age , int income , double looks){

        boolean ageInRange = age >= 25 && age <= 40;
        boolean isRich = income > 500000;
        boolean goodLooking = looks > 8.5;

        return ageInRange && (isRich || goodLooking);

    }

}





