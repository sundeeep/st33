import java.util.Scanner;


public class StringDemo{


    public static void main(String[] args){
        String str1 = new String("Sandeep");
        System.out.println("String : "+str1.hashCode());
        str1 = str1+" Kumar";
        System.out.println("String : "+str1.hashCode());


        StringBuffer str2 = new StringBuffer("Sandeep");
        System.out.println("Buffer String : "+str2.hashCode());
        str2.append(" Kumar");
        System.out.println("Buffer String : "+str2.hashCode());

        // System.out.println("String Buffer string: "+str2);
    }
}