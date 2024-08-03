import java.util.Scanner;

public class StringReversal{
    static String result = "";

    public String reverseTheString(String name, int index){
        if(index < 0){
            return result;
        }
        result = result + name.charAt(index);
        reverseTheString(name, index-1);
        return result;
    }

    public static void main(String[] args){
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        name = input.nextLine();
        StringReversal obj = new StringReversal();
        String revString = obj.reverseTheString(name, name.length()-1);
        System.out.println("The Reversed String: "+revString);
    }
}