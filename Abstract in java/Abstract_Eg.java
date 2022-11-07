public class Abstract_Eg 
{

    public static void main(String[] args) 
    {
        // Animals animals = new Animals();    //  error: Animals is abstract; cannot be instantiated

        Animals animals = new Cat();
        animals.sound();
  
        animals = new Dog();
        animals.sound();
    }
}

abstract class Animals{
    private String name;
 
    // All kind of animals eat food so make this common to all animals
    public void eat(){
         System.out.println(" Eating ..........");
    }
 
    // The aninals make different sounds. They will provide their own implementation
    abstract void sound(); 
}

class Cat extends Animals{

    @Override
    void sound() {
        System.out.println("Meoww Meoww ........");
    }
}

class Dog extends Animals {

    @Override
    void sound() {
         System.out.println("Woof Woof ........");
    }
}