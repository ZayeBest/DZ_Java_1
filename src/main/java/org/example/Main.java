package org.example;

public class Main {
    public static void main(String[] args) {


        String name = "Ihor";
        int height = 186;
        float weight = 79.5F;

        System.out.println( "My name is " +name + ", my height is " + height + " sm, weight is " + weight + " kg");
        System.out.println("");

        int a = 1;
        int b = 2;

        System.out.println( " a = "+ a+ "   b = "+ b);

        int x = a;
        a = b;
        b = x;

        System.out.println( " a = "+ a+ "   b = "+ b);
        System.out.println("");

        a = 5;
        b = 3;

        System.out.println( " a = "+ a+ "   b = "+ b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println( " a = "+ a+ "   b = "+ b);
    }
}