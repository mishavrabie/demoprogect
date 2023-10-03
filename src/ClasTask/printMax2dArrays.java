package ClasTask;
import java.util.*;
public class printMax2dArrays {

        public static void main(String[] args) {



            // write your code here
            int[][] arr = new int[7][9];

            int max =Integer.MIN_VALUE;
            for(int i= 0; i<arr.length;i++){
                for(int j = 0;j< arr[i].length;j++){
                    arr[i][j]=(int)(Math.random()*100+1);
                    if(arr[i][j] > max){
                        max = arr[i][j];

                    }
                }

            }
            //System.out.println(Arrays.deepToString(arr)+"\n"+ "The largest number "+max);

            for(int[]arr2 : arr){
                for(int element : arr2){
                    System.out.print(element + " \t");
                }
                System.out.println();
            }
            System.out.println("The largest number is:" + max);
        }

}
