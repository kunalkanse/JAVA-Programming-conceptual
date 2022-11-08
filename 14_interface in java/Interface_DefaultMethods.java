/**
    Program demonstrates concepts of interfaces
    which contains abstract as well as default methods

    @author Kunal kanse 

 */

interface Vehicle 
{
    //Abstract methods
    String getBrand();
    String speedUp();
    String slowDown();

    //Default methods
    default String turnAlarmOn() 
    {
        return "Turning the vehice alarm on.";
    }

    default String turnAlarmOff() 
    {
        return "Turning the vehicle alarm off.";
    }

    static int getHorsePower(int rpm, int torque)
    {
        return (rpm * torque) / 5252;
    }
}


class Car implements Vehicle {

    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    //Defining abstract methods of interface
    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The car is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The car is slowing down.";
    }
}

class Interface_DefaultMethods
{
    public static void main(String[] args) 
    {

        Car car = new Car("BMW");

        /* Interfaces cannot be instantiated directly.
         But can create reference which referes to Class which extends interface
         AS :

            //Vehicle car = new Car("BMW"); //works
        */ 
        

        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());

        System.out.println(Vehicle.getHorsePower(2500, 480));   // calling static method of interface

    }
}