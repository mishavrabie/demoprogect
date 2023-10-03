package ClasTask;
public class isEvanNum {

    public static void main(String[] args) {
        System.out.println(isEvan(3));

    }

    public static boolean isEvan(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
