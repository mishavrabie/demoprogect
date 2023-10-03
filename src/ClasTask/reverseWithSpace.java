package ClasTask;

public class reverseWithSpace {
    public static void main(String[] args) {
        System.out.println(reWithSpace("hi bye"));
    }
public  static String reWithSpace(String str) {
    int indexOfSpace = str.indexOf(' ');
    String reversed = "";
    for (int i = str.length() - 1; i >= 0; i--){
       reversed += str.charAt(i);
    }
    //get rid of space
    reversed = reversed.replace(" ","");
      return  reversed;
}

}
