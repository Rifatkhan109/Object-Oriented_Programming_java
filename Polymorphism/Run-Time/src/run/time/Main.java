package run.time;

public class Main{
   public static void main(String[] args) {
        Animal a = new Animal();
        Animal b = new Dog();
        Animal c = new Cat();
        
        a.makeSound(); // "The animal makes a sound"
        b.makeSound(); // "The dog barks"
        c.makeSound(); // "The cat meows"

    }

}