class Vehicle
{
    void start()
    {
        System.out.println("Vehical is start");
    }
}

class Car extends Vehicle{

    @Override
    void start()
    {
        System.out.println("Car starts");
    }
}

class Bike extends Vehicle{

    @Override
    void start()
    {
        System.out.println("Bike starts");
    }
}

class Truck extends Vehicle{

    @Override
    void start()
    {
        System.out.println("Truck starts");
    }
}

class Main
{
  public static void main(String[] args) {
   
    Vehicle v;

    v=new Vehicle();
    v.start();

    v= new Car();
    v.start();

    v=new Truck();
    v.start();
    
    v=new Bike();
    v.start();

  }  
}