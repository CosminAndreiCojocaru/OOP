package oop2.Overloading;

public class Overloading {

    public static void main(String[] args) {

        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(1, 2, 4));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public static int add(int a, int b, int c, int d) {
        return add(a, b, c) + d;
    }
}
