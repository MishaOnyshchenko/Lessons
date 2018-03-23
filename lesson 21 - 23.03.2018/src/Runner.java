import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by java on 23.03.2018.
 */
public class Runner {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("K", "V");
//        if(!map.containsKey("C")){
//            System.out.println("Such element is absent!");
//        }
//        System.out.println(map.containsKey("C")?"ok":"No such element!");
//        System.out.println(map.getOrDefault("C","net takogo, ramotaem plotno c Idea"));


        char letter = 'a';
        char[] charArray = new char[27];

        List<Character> even = new ArrayList<>();
        List<Character> notEven = new ArrayList<>();

        for (int i = 1; i < 27; i++) {
            charArray[i] = letter;
            letter++;
            if(i%2==0){
                even.add(charArray[i]);
            }
            if(i%2!=0){
                notEven.add(charArray[i]);
            }
        }
        System.out.println("Even: " + even);
        System.out.println("NotEven: " + notEven);

        Queue<Character> characterQueue = new ArrayDeque<>();

        for (int i = 1; i < charArray.length; i++) {
            characterQueue.add(charArray[i]);
        }

        System.out.println("QueMoe: " + characterQueue);

        ArrayList <Character> evenArr = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            if((i+1)%2 == 0){
                evenArr.add(characterQueue.poll());
            }
        }
        System.out.println("EvenArr - " + evenArr);
        System.out.println("LAst - " + characterQueue);









    }
}
class Person{
    private String name;

}
