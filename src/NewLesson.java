import java.util.HashMap;
import java.util.Map;

public class NewLesson {
    public static void main(String[] args) {
//        System.out.println(print("2")+2);
//    }
//    public static String print(String s) {
//        return s;
//    }
//    public static int print(int s) {
//        return s;
        Map<Integer, String> persons = new HashMap <Integer, String>();
        persons.put(4582, " sava ikn kop");
        persons.put(4573, " nina supa dop");
        persons.put(1236, " gjfm hjjn nhg");
        persons.put(4587, " wsdn dk mko");
       // System.out.println(persons.get(4582));// sava...
       // System.out.println(persons.keySet()); // 4852,4573,4587
       // System.out.println(persons.values()); // tolko imena
      //  System.out.println(persons.replace(4582, " "));
        //System.out.println(persons.get(4587));
        //System.out.println(persons.size());
        for (Map.Entry<Integer, String> items: persons.entrySet()){
            System.out.println(" Key " + items.getKey() + "  value : " + items.getValue());

        }

    }
}