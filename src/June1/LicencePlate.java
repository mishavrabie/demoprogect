package June1;
public class LicencePlate {
    public static void main(String[] args) {
// using Math.random

    char s1 =(char)(65+ (Math.random()*26));
    char s2 =(char)(65+ (Math.random()*26));
    char s3 =(char)(65+ (Math.random()*26));
    int num = 1000 +(int)(Math.random()*9000);
   System.out.println("" + s1 + s2 + s3 +"-"+ num );
}



}
