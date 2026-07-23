import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day03_001_HashMap_Person_Age
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<>();
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);

        System.out.println(map.get("Yash"));

        map.put("Akash", 25);
        System.out.println(map.get("Akash"));
        map.remove("Akash");
        System.out.println(map.containsKey("Akash"));
        System.out.println(map.containsKey("Yash"));

        map.putIfAbsent("Yashika",30);
        map.putIfAbsent("Yash",30);

        //Get all keys
        System.out.println(map.keySet());

        //Get all values
        System.out.println(map.values());

        //Get all entries

        System.out.println(map.entrySet());

        for (var e : map.entrySet())
        {
            System.out.printf("%s : %d \n",e.getKey(),e.getValue());
        }

        System.out.println();

        for (String key: map.keySet())
        {
            System.out.printf("%s:%d \n" ,key,map.get(key));
        }

    }
}
