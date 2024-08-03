import java.util.*;

public class ElementCount 
{

    public static void main(String[] args)
	{
        int[] array = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};

        Map<Integer, Integer> m = new HashMap<>();
            for (int i: array)
			{         
				if (m.containsKey(i)) 
				{
					m.put(i, m.get(i) + 1);
				} 
				else 
				{
					m.put(i, 1);
				}
			}
	        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println("Element " + entry.getKey() + " repeats " + entry.getValue() + " times");
        }
	}
}