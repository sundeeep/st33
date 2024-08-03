import java.util.Scanner;

class TooOldException extends Exception{
    public TooOldException(String exceptionMessage){
        super(exceptionMessage);
    }
}

class TooYoungException extends Exception{
    public TooYoungException(String exceptionMessage){
        super(exceptionMessage);

    }
}

public class AgeValidator{
    private static boolean isException = false;
    private static boolean isFirstTime = true;
    public void validateAge(int age) throws TooOldException, TooYoungException{
        if(age < 18){
            throw new TooYoungException("You are too young to enter the bar");
        }
        else if(age > 65){
            throw new TooOldException("You are too old to enter the bar");
        }
        else{
            this.isException = false;
            System.out.println("Correct age, You can go ahead.");
        }
    }

    public static void main(String[] args) throws TooOldException, TooYoungException{
        while(isException || isFirstTime){
        try{
            isFirstTime = false;
            AgeValidator validate = new AgeValidator();
            Scanner input = new Scanner(System.in);
            int age;
            if(isException) System.out.println("Invalid Age, We need the people with age between 18 and 65");
            System.out.print("Enter your age: ");
            age = input.nextInt();
            validate.validateAge(age);
        }catch(Exception exception){
            isException = true;
        }
        }

    }
}