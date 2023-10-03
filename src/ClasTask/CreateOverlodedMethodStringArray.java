package ClasTask;

public class CreateOverlodedMethodStringArray {
//Create 3 overloaded versions of randomString() method that generates a random String and returns it
        public static void main(String[] args) {


            // TEST your methods here

            System.out.println( randomString()); //  dshvf (example, the actual chars could be different)

            System.out.println( randomString(7)); //cbsassw
            System.out.println( randomString(5, true)); // RVDHC
            System.out.println( randomString(3, false)); //hsd

        }

        // Create 3 overloaded methods here
        public static String randomString(){
            String alphabet ="AAQWERTYUIOPSDFGHJKLZXCVBNM";
            return randomString(5);
        }
//Second method should accept the length of the string as parameter and  generate a random String of
// lowercase charcters of given length
        public static String randomString(int length){
            String alphabet ="AQWERTYUIOPSDFGHJKLZXCVBNM";
            String randomString = "";
            for(int i = 0 ; i < length;i++){
                int randomindex = (int)(Math.random() * alphabet.length());
                randomString += alphabet.charAt(randomindex);

            }
            return randomString.toLowerCase();
        }
    //Third method should accept the length of the string and boolean parameter called isUppercase  and
    // generate a random String of uppercase charcters of given length if the boolean value is true,
    // therwise generates all lowercase

        public static String randomString(int length ,boolean isUppercase){
            String alphabet ="AQWERTYUIOPSDFGHJKLZXCVBNM";
            String randomString = "";
            for(int i =0;i<length;i++){
                int randomIndex= (int)(Math.random() * alphabet.length());
                randomString += alphabet.charAt(randomIndex);
            }
            return isUppercase == true ? randomString.toUpperCase(): randomString.toLowerCase();
        }



}
