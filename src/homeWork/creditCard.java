package homeWork;

public class creditCard {

        public static void main(String[] args) {

            // test your method below

            //System.out.println(getRandomCreditCardNo(1));
            //System.out.println(getRandomCreditCardNo(2));
            System.out.println(getRandomCreditCardNo(3));
            //System.out.println(getRandomCreditCardNo(4));
            // System.out.println(getRandomCreditCardNo(0));
            // System.out.println(getRandomCreditCardNo(2330));


        }
        public static String getRandomCreditCardNo(int number){

            // implement the method here
            if ( number == 1 ){
                long amEx = (long)(Math.random() * 100000000000000L +1000000000 );
                return "3" + amEx;
            }else if ( number == 2 ){
                long visa = (long)(Math.random() * 1000000000000000L + 10000000 );
                return "4" + visa;
            }else if( number == 3 ){
                long masterCard = (long)(Math.random() * 1000000000000000L +100000000 );
                return "5" + masterCard;
            }else if (number == 4){
                long discover = (long)(Math.random() * 1000000000000000L + 100000000 );
                return "6" + discover;
            }else{
                return "0";
            }
        }

}
