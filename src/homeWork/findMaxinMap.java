package homeWork;
import java.util.*;

class Main {
    public static void main(String[] args) {

        //TESTS
        System.out.println(findMaxOccurrence(List.of(1, 2, 2, 3, 3, 3))); //  3
        System.out.println(findMaxOccurrence(List.of(4, 4, 4, 1, 1, 1, 2))); //  4
        System.out.println(findMaxOccurrence(new ArrayList<>())); //  null


    }


    public static Integer findMaxOccurrence(List<Integer> numbers){
        Map<Integer , Integer>map = new TreeMap<>();

        if(numbers.isEmpty()){
            return null;
        }
        for(int count : numbers){
            map.put(count, map.getOrDefault(count , 0)+1);
        }

        int max = Integer.MIN_VALUE;
        int mostRepetedWord = 0;


        for(Map.Entry<Integer , Integer>entry : map.entrySet()){
            int count = entry.getValue();
            if(count > max){
                max = count;
                mostRepetedWord = entry.getKey();
            }
        }

        return mostRepetedWord;
    }
}




