import java.util.*;
class SunnyNumber 
{
    public static void main(String args[])
    {     
        Scanner in = new Scanner(System.in);
        int n,a,c=0;
        System.out.println("Enter Number : ");
        n= in.nextInt(); //24
        for(int i=1;i<=n;i++)
        {
            a= (i*i)-1;//
			if(a==n)
            {
                c=1;
				break;
            }
        }
        if(c==1)
        {
            System.out.println("It is a Sunny Number : "+n);
        }
        else
        {
            System.out.println("It is not a Sunny Number : "+n);
        }
    } 
}