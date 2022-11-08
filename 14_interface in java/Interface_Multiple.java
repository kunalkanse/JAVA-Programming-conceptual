/**
    class inmplements multiple interfaces
    Program demonstrates concepts of interfaces
    which contains abstract as well as default methods

    interface Alarm & Vehicle both contain same default method 
    solution is given to resolve the ambiguity
    

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

interface Alarm 
{
    default String turnAlarmOn() 
    {
        return "Turning the alarm on.";
    }

    default String turnAlarmOff() 
    {
        return "Turning the alarm off.";
    }
}

class Car implements Vehicle,Alarm {

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

    //Solution for resolve ambiguity

    @Override
    public String turnAlarmOn() 
    {
        return Vehicle.super.turnAlarmOn() + " " + Alarm.super.turnAlarmOn();
        //return Vehicle.super.turnAlarmOn();
    }
        
    @Override
    public String turnAlarmOff() 
    {
        return Vehicle.super.turnAlarmOff() + " " + Alarm.super.turnAlarmOff();
    }

/*
    @Override
    public String turnAlarmOn() 
    {
        return Alarm.super.turnAlarmOn();
    }
    
    @Override
    public String turnAlarmOff() 
    {
        return Alarm.super.turnAlarmOff();
    }*/
}

class Interface_Multiple
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