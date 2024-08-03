public class Human{
    int noOfTeeth = 24;
    String name;
    String father;
    String mother;

    Human(){

    }

    // First Use Case Of this.
    Human(String n, String f, String m){
        this.name = n;
        this.father = f;
        this.mother = m;
    }

    void show(){
        System.out.println(name+" "+father+" "+mother);
    }

    void run(){
        this.show();
        System.out.println("Running");
    }

    void eat(){
        this.run();
        System.out.println("Eating");
    }

    public static void main(String[] args){
        //Object Creation or Instantiation
        Human sandeep = new Human("Sandeep Kumar Dasari", "Suresh", "lakshmi");
        sandeep.eat();
    }

}