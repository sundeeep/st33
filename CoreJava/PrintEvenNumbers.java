public class PrintEvenNumbers{
    public static void main(String[] args){
        for(int num=1; num<= 100; num++){
            if(num % 2 != 0){
                continue;
            }
            System.out.print(num+ " ");
        }
    }
}