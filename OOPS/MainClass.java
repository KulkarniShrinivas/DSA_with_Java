package OOPS;

public class MainClass {
    public void main(String[] args) {
        Person p1= new Person();
        p1.age = 24;
        p1.name = "Rahul";

        Person p2= new Person();
        p2.name = "Rohit";
        p2.age = 25;

        p1.walk();
        p2.eat();
        p1.walk(5);

    }

    public class Person{
        String name;
        int age;

        //method
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


