import java.util.Scanner;
import java.io.*;

public class StringsToCharArray{
    public static void main(String[] args){
        String name;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name to list out the characters in that name: ");
        name = input.nextLine();
        for(int index=0; index<name.length(); index++){
            System.out.println(name.charAt(index));
        }
    }
}