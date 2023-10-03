package homeWork;

public class SubstringMethod {
    public static void main(String[] args) {
        String str = "laptops out for harambe";

        //write code below
        System.out.println(str.substring(5));
        System.out.println(str.substring(7, 10));
        System.out.println(str.substring(str.length()-7));//fill in substring so it prints "harambe"
        System.out.println(str.substring(10,13)); //fill in substring so it prints "t f"
    }
    }
