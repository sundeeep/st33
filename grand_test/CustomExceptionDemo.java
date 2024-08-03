
/**
 * 6) Write a java program to create custom exception by using try, catch, throw, throws and
finally? 

 */
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public void checkNumber(int number) throws CustomException {
        if (number > 5) {
            throw new CustomException("Number is greater than 5");
        }
    }


    public static void main(String[] args) {
        try {
            CustomExceptionDemo ced = new CustomExceptionDemo();
            ced.checkNumber(10);
        } catch (CustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }

    
}
