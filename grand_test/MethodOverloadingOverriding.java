/**
 * 7) Write a java program to implement method overloading and overriding? 
 */

class OverloadingClass {
    public void display(int num) {
        System.out.println("Method with one number: " + num);
    }

    public void display(int numOne, int numTwo) {
        System.out.println("Method with two numbers: " + numOne + ", " + numTwo);
    }

    public void display(String str1, String str2) {
        System.out.println("Method with two strings: " + str1 + ", " + str2);
    }
}

class OverridingClass extends OverloadingClass {
    @Override
    public void display(int num) {
        num = num + 1; //we have changed the functionality of the program.
        System.out.println("Overridden method with one parameter: " + num);
    }
}

public class MethodOverloadingOverriding {
    public static void main(String[] args) {
        OverloadingClass overloadingObj = new OverloadingClass();
        overloadingObj.display(5);
        overloadingObj.display(5, 10);

        OverridingClass overridingObj = new OverridingClass();
        overridingObj.display(5);
    }
}
