/**
 * 10) Write a java program to implement lambda expression? 
 */

interface CounterInterface
{
    void incrementOne(int x);

    
    default void greeting()
    {
        System.out.println("Hello, this is Sundeeepuuu");
    }
}

class LambdaExpression
{
    public static void main(String args[])
    {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num=input.nextInt();
        CounterInterface ci = (int num)->System.out.println(num+1);
        ci.incrementOne(num);
    }
}