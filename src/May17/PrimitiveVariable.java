package May17;

public class PrimitiveVariable {

    public static void main(String[] args){
        // Java has 2 general categories of variables: primitive and object

        int age = 55; // primitives can only store some data
        String name = "Jerrod"; // Object type can not only store data but perform operation
        System.out.println(age);
        System.out.println(name.toUpperCase());

//   Comon data we store
        //numbers
                 // (integral) --> 34, 67
                 //decimal-point number  -->23.5    double is most comon decimal data
        // Java offers integral and decimal types
        byte someNumber = 12;// Byte can store with in range:-128 to 127

        short shortNum = 32677; //uses 2 bytes , range is approximately -32677 to 32678

        int intNum = 21000000; // uses 4 bytes range is approximatly 2 bln

        long longNum = 5467897765L; // uses 8 bytes , range is around 19 digits
              // long uses L on the end of number
        double weight = 110.45;
        float height = 5.11F;  // Float uses F on the end of the number
             // main difrence betwen Float and Double is store the value more precise
             // Double has double of precision then the Float


               // to a single character such A OR $
         char someChar = '$'; // uses 2 bytes, range 0 to 65535
//
//        boolean isonline = true;
//        boolean isMaried = false;
//         if(isonline) {
//             System.out.println("send a zoom link");
//         }else{
//             System.out.println("Dont't send the link");
//         }



         String lasName = "Kenedy"; // string are used to store text
        //text
        //character
        //values such as true,false


    }




}
