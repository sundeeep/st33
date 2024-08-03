class SuperClass{
    void show(){
        System.out.println("show() in Super Class");
    }
    public static void main(String[] args){
        System.out.println("Super Class");
    }
}

class SubClass extends SuperClass{
    @Override
    void show(){
        System.out.println("show() in Super Class");
    }
    
    public static void main(String[] args){
        System.out.println("Subclass main method");
    }
}