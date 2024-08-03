public class MainDemo{

    public static int main(String[] args){
        return 5;
    }
    public static void main(String[] args){
        System.out.println("Main method");
        MainDemo md = new MainDemo();
        System.out.println("Private main method: "+md.main(args));
    }
}