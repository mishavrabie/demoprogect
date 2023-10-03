package homeWork;
import java.util.*;

public class mapClas {
    public static void main(String[] args) {

        System.out.println(wordCount("I would like to go to the park and I would like to play soccer"));
        //  {I=2, would=2, like=2, to=3, go=1, the=1, park=1, and=1, play=1, soccer=1 }
        System.out.println(wordCount("I you him you them you I her her her I"));
        //{I=2, you=3, him=1, them=1, her=3}
    }

      public  static Map<String , Integer> wordCount(String sentance){

        Map<String , Integer> wordCount = new LinkedHashMap<>();
        String[] words = sentance.split(" ");

        for(String word : words){
            if(!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            }else{
                Integer value = wordCount.get(word);
                value++;
                wordCount.put(word, value);

            }
        }
        return wordCount;
      }
}
