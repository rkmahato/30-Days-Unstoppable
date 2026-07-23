import java.util.*;

public class Day03_002_Most_Frequent_Element
{

    public static  void Freaquence(int []arr)
    {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : arr)
        {
            if (!freq.containsKey(num))
            {
                freq.put(num,1);
            }
            else
            {
                freq.put(num,freq.get(num)+1);
            }
        }
        for (var num : freq.entrySet()) {
            System.out.printf("%d %d \n", num.getKey(), num.getValue());
        }
        int maxFreq = 0;int ansKey = -1;
        for (var e : freq.entrySet())
        {
            if(e.getValue()>maxFreq)
            {
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println(ansKey);
    }
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,3,3,4,4,5,6,6,6,6};
        Freaquence(arr);
    }

}
