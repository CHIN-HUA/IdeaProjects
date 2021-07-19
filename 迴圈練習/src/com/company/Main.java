package com.company;

class Rock {
    Rock() { // This is the constructor
        System.out.println("Creating Rock");
    }
}
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++)
            new Rock();
    }
} ///:~

