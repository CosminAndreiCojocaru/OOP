package oop2.Overriding;

public class Dog extends Animal  {

    @Override
    void eat() {
        System.out.println("eating bread...");
    }

    void sleep(){
        System.out.println("sleeping");
    }
}
