package homeWork;
//Create a method named isUnique that takes an array of integers as a parameter and that returns a boolean value indicating whether or not the values in the array are unique(i.e has no duplicates).
public class countingUniq {
    public static void main(String[] args) {

        //TESTS
        System.out.println(isUnique(new int[] {1,2,3,4,5,6})); //-> true
        System.out.println(isUnique(new int[] {1,2,3,4,5,6,1})); //-> false
        System.out.println(isUnique(new int[] {1,3,3,3,3,3,3})); //-> true
        System.out.println(isUnique(new int[] {9,45,0,1,23,89,22,55})); //-> true
        System.out.println(isUnique(new int[] { 55 })); //-> true


    }


    public static boolean isUnique(int[] arr){
        //method implementation here
        int min = 0;
        for(int i =0, j= i+1 ;i < arr.length && j<arr.length;i++,j++){
            if(min > arr[j]){
                min = arr[i];
                arr[i] = arr[j];
                arr[j] = min;
            }
        }
        for(int i = 0;i < arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                return false;
            }
        }
        return true;
    }
}

