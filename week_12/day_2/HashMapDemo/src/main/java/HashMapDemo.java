import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[]args){
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Ash", 100);
        ages.put("Ben", 21);
        ages.put("Steve", 80);
        ages.put("Eden", 3);

        Integer ashAge = ages.get("Ash");

        String output = "My son's age is " + ashAge.toString();
        System.out.println(output);
    }
}
