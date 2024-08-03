public class RepeatedArray
 {

    public static void main(String[] args) 
	{
        int[] array = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};
        boolean[] view = new boolean[array.length];
        for (int i = 0; i < array.length; i++) 
		{
            if (view[i]) 
			{
                continue;
            }
            int count= 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    view[j] = true;
                    count++;
                }
            }

           
            System.out.println("Element " + array[i] + " repeats " + count + " times");
        }
    }
 }