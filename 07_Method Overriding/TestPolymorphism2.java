
class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}
class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}
class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}
class TestPolymorphism2 {
    public static void main(String args[]) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}


// overriding not apllicable for data members

/*
class Bike {
    int speedlimit = 90;
}
class TestPolymorphism2 extends Bike {
    int speedlimit = 150;

    public static void main(String args[]) {
        Bike obj = new TestPolymorphism2();
        //TestPolymorphism2 obj = new TestPolymorphism2();

        System.out.println(obj.speedlimit); //90  
    }
}
*/

/*

class Animal {
    void eat()
    {
        System.out.println("animal is eating...");
    }
}
class Dog extends Animal {

    @Override
    void eat() 
    {
        System.out.println("dog is eating...");
    }
}
class TestPolymorphism2 extends Dog {
    public static void main(String args[]) 
    {
        Animal a = new TestPolymorphism2(); //upasting
        a.eat();
    }
}
*/


