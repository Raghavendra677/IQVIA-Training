package Day3;

class Animal{
    public void sound() {
        System.out.println("Day3.Animal makes sound");
    }
}

class Dog extends Animal{
    public void sound() {
        System.out.println("Day3.Dog barks");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal a= new Animal();
        Animal d= new Dog();
        a.sound();
        d.sound();
    }
}

