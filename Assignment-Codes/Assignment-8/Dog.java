interface Animal {
    void bark();
}

public class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
