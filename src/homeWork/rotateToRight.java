package homeWork;
import java.util.*;
//Create a method named rotateRight that accepts an array of integers as a parameter and rotates the values in the
// array to the right by one and returns the modified array. Each element moves right by one, except the
// last element, which moves to the front.
public class rotateToRight {
    public static void main(String[] args) {

        //TESTS
        System.out.println(Arrays.toString(rotateRight(new int[] {3, 8, 19, 7}))); //-> {7, 3, 8, 19}
        System.out.println(Arrays.toString(rotateRight(new int[] {1,2,3,4,5,6}))); //-> {6,1,2,3,4,5}
        System.out.println(Arrays.toString(rotateRight(new int[] {1,3,2}))); //-> {2,1,3}
        System.out.println(Arrays.toString(rotateRight(new int[] {9,45,0,1,23,89,22,55}))); //-> {55,9,45,0,1,23,89,22}



    }


    public static int[] rotateRight(int[] arr){
        //method implementation here
        int temp = arr[arr.length-1];
        for(int i = arr.length-1;i>=0;i--){
            if(i == 0){
                arr[i] = temp;
            }else{
                arr[i]=arr[i-1];
            }
        }
        return arr;
    }
}

