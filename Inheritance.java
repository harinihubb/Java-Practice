import java.util.*;

class Animal{
    String name;
    int age;
    void makesound(){
        System.out.println("Ani mal makes a sound");
    }
}

class Cat extends Animal{
    String color;
    
    void makesound(){
        System.out.println("Cat meows");
    }
    void climb(){
        System.out.println("Cat is climbing");
    }
}

class Dog extends Animal{
    String breed;
    
    void makesound(){
        System.out.println("Dog barks");
    }
    void fetch(){
            System.out.println("Dog is fetching");
        }
}

public class Main{
    public static void main(String [] args){
        Dog d = new Dog();
        d.name = "pattu";
        d.age = 2;
        d.breed = "road";
        System.out.println(d.name);
        System.out.println(d.breed);
        d.makesound();
        d.fetch();
        Cat c = new Cat();
        c.name = "puttu";
        c.age = 2;
        c.color = "blue";
        System.out.println(c.name);
        System.out.println(c.color);
        c.makesound();
        c.climb();
        
    }
}