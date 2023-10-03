package homeWork;
import java.util.*;
public class kthLargest {
//Create a method called kthLargest that accepts an int array and an integer k and returns "k"th largest
//element from that array. If k = 1, return the largest element; if k = 2, return the second largest element, and so on.

        public static void main(String[] args) {

            //TESTS
            System.out.println( kthLargest(new int[] {74, 85, 102, 99, 101, 56, 84}, 2)); // 101
            System.out.println( kthLargest(new int[] {74, 85, 102, 99, 101, 56, 84}, 1)); // 102
            System.out.println( kthLargest(new int[] {74, 85, 102, 99, 101, 56, 84}, 3)); // 99
            System.out.println( kthLargest(new int[] {2, 72, 81, 53, 342, 21, 34, 90, 88, 56}, 1)); // 342
            System.out.println( kthLargest(new int[] {2, 72, 81, 53, 342, 21, 34, 90, 88, 56}, 5)); // 72
            System.out.println( kthLargest(new int[] {2, 72, 81, 53, 342, 21, 34, 90, 88, 56}, 8)); // 34
        }


        public static int kthLargest(int[] arr, int k){
            //method implementation here


            Arrays.sort(arr);


            return arr[arr.length-k];
        }

}
