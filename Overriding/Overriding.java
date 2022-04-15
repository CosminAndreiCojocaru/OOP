package oop2.Overriding;

public class Overriding {


    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.eat();
        animal1.drink();

        Animal animal2 = new Dog();
        animal2.eat();
        animal2.drink();
//        animal2.sleep does not work because type is Animal

        //Casting
        Animal animal3 = new Dog();
        Dog animal31 = (Dog) animal3;

        animal31.sleep();
        //OR the shortcut calling method .sleep on the casted to Dog type object animal3
        ((Dog) animal3).sleep();

    }


}

