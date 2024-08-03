/**
 * 9) Write a java program that shorts HashMap by value? 

 */
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class HashMapSorting{
    public void sortHashMapByValue(HashMap<String, Integer> StudentPercentageMap){
        List<Map.Entry<String, Integer>> list = new ArrayList<>(StudentPercentageMap.entrySet());
        list.sort(Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
    public static void main(String[] args){
        HashMap<String, Integer> StudentPercentageMap = new HashMap<String, Integer>(); 
        Scanner input = new Scanner(System.in);
        int noOfRecords;
        System.out.print("Number of Students Records to Enter: ");
        noOfRecords = input.nextInt();
        

        for(int i = 0; i<noOfRecords; i++){
            String studentName;
            int studentMarks;
            System.out.print("Enter the Student User Name: ");
            studentName = input.next();
            System.out.print("Enter the Student Marks: ");
            studentMarks = input.nextInt();

            StudentPercentageMap.put(studentName, studentMarks);
        }

        HashMapSorting hms = new HashMapSorting();
        hms.sortHashMapByValue(StudentPercentageMap);
    }
}

