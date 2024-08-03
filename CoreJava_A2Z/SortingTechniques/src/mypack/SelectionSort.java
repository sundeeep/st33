package mypack;

public class SelectionSort 
{
	    void sort(int arr[])
	    {
	    	for (int i = 0; i < arr.length-1; i++)
	        {
	            int min = i;//0
	            for (int j =i+1; j <arr.length; j++)
	            {
	                if (arr[j] < arr[min])
	                {
	                    min= j;
	                }
	          
	            }
	            int temp = arr[min];
	            arr[min] = arr[i];
	            arr[i] = temp;
	        }
	    }

	    
	    public static void main(String args[])
	    {
	        SelectionSort ob = new SelectionSort();
	        int arr[] = {6,3,-9,2,44,-9,65,-24,3,6,7,-36};
	        ob.sort(arr);
	        System.out.println("Sorted array");
	       for(int i:arr)
	    	   System.out.println(i);
	    }
}


