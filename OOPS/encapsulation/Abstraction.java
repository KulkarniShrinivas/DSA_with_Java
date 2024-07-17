package OOPS.encapsulation;

public class Abstraction {
    public static void main(String[] args) {
        Audi a = new Audi();
        BMW b = new BMW();

        a.start();
        b.start();
    }

    public static class Audi extends Car {
        @Override
        void start() {
            System.out.println("Audi is starting");
        }
    }

    public static class BMW extends Car {
        @Override
        void start() {
            System.out.println("BMW is starting");
        }
    }

    public abstract static class Car {
        int price;

        abstract void start();

        //in this we can add bodys like concreat functions
        //for example beaks
        void breaks() {
            System.out.println("Car is breaking");

            //but in interfaces it provides true interfaces
        }
    }
}
