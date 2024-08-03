import java.util.Scanner;

class AgeTooYoungException extends Exception{
    public AgeTooYoungException(String exceptionMessage){
        super(exceptionMessage);
    }
}

class AgeTooOldException extends Exception{
    public AgeTooOldException(String exceptionMessage){
        super(exceptionMessage);
    }
}

public class AgeValidatorDemo{

    public static void main(String[] args) throws AgeTooYoungException, AgeTooOldException{
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = input.nextInt();

            if(age < 18){
                throw new AgeTooYoungException("Your age is too young to enter into the bar.");
            }
            else if(age > 65){
                throw new AgeTooOldException("Your age is too old to enter into the bar.");
            }
            else{
                System.out.println("Congratulations! You can enter into the bar.");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}