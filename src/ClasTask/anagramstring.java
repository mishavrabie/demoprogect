package ClasTask;
import java.util.*;
public class anagramstring {


        public static void main(String[] args) {

            //TESTS
            System.out.println(isAnagram("abca","caba")); // true
            System.out.println(isAnagram("abc","abb")); // false
            System.out.println(isAnagram("night","thing")); // true
            System.out.println(isAnagram("cola","loco")); // false

        }


        public static boolean isAnagram(String str1, String str2){
            char [] charr = str1.toCharArray();
            char [] charr2 = str2.toCharArray();
            Arrays.sort(charr);
            Arrays.sort(charr2);

            return Arrays.equals(charr,charr2);
        }
    }

