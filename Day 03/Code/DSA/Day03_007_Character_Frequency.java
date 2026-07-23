import java.util.*;

public class Day03_007_Character_Frequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Your code here
        String s = scanner.nextLine().toLowerCase();
        char [] charArray = s.toCharArray();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(char el:charArray)
        {
            if(el==' ')
            {
                continue;
            }
            if(!map.containsKey(el))
            {
                map.put(el,1);
            }
            else
            {
                map.put(el,map.get(el)+1);
            }
        }
        for(var el:map.entrySet())
        {
            System.out.printf("%c:%d\n",el.getKey(),el.getValue());
        }
    }
}
