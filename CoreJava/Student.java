public class Student{

    int studID;
    String studName;
    Student(int ID, String name){
        this.studID = ID;
        this.studName = name;
    }

    void show(){
        System.out.println("Student ID: "+studID);
        System.out.println("Student Name: "+studName);
    }

    public static void main(String[] args){
        Student obj1 = new Student(123, "Sandeep");
        Student obj2 = new Student(143, "Suresh");

        obj1.show();
        obj2.show();
    }
}