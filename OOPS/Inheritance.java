package OOPS;

import OOPS.encapsulation.Encapsulation;

public class Inheritance {
    public static void main(String[] args) {
        Developer dev = new Developer(30, "John Doe");
        dev.walk();
        dev.eat();
        dev.walk(100);

//        Encapsulation obj = new Encapsulation();
//        obj.doWork();
    }

    static class Developer extends Person {
        public Developer(int age, String name) {
            super(age, name); // Correctly pass age and name to the superclass constructor
        }
    }

    static class Person {
        String name;
        int age;

        public Person(int age, String name) {
            this.name = name;
            this.age = age;
        }

        public void walk() {
            System.out.println(name + " is walking");
        }

        void eat() {
            System.out.println(name + " is eating");
        }

        void walk(int steps) {
            System.out.println(name + " walked " + steps + " steps");
        }
    }
}