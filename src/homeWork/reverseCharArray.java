package homeWork;
import java.util.*;
public class reverseCharArray {
    public static void main(String[] args){
    //TESTS
    reverse(new char[] {'a', 'b', 'c'}); //-> [c, b, a]
    reverse(new char[] {'c', 'i', 'v', 'i', 'c'}); // -> [c, i, v, i,    c]
    reverse(new char[] {'j', 'a', 'v', 'a'}); // -> [a, v, a, j]
    reverse(new char[] {'y', 'o'}); //  -> [o, y]
    reverse(new char[] {'o'}); // -> [o]
}


    public static void reverse(char[] arr){
        //method implementation here
        char temp = 0;
        for(int i = 0 , j= arr.length-1; i < j;i++,j-- ){
            temp = arr[i];
            arr[i] =arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
