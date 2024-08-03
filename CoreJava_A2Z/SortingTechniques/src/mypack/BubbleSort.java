package mypack;
import java.util.*;
public class BubbleSort
{
	 void bubbleSort(int array[])
	 {
	    int size = array.length;//5
	     for (int i = 0; i < size - 1; i++)//0 to 4
	      for (int j = 0; j < size - i - 1; j++)//0 to 4

	    	  if (array[j] > array[j + 1])//-2, 45, 0, 11, -9
	    	  	{
		
			          int temp = array[j];//45
			          array[j] = array[j + 1];//
			          array[j + 1] = temp;//-2 0 45 0 -9
	    	  	}
	  }

	  public static void main(String args[]) 
	  {
	      
	    int[] data = { -2, 45, 0, 11, -9 };
	    
	  BubbleSort obj=new BubbleSort();
	   obj.bubbleSort(data);
	    
	    System.out.println("Sorted Array in Ascending Order:");

	    for(int i:data)
	    	System.out.println(i);
	  }
	}


