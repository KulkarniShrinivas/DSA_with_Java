package OOPS;

public class Constructors {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human("Rahul", 23);
        obj1.introduce();
        obj2.introduce();
    }

    public static class Human {
        String name;
        int age;

        public Human() {
            name = "Unknown";
            age = 0;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void introduce() {
            System.out.println("Hi! My name is " + name + " and I am " + age + " years old.");
        }
    }
}
