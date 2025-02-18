package day8;
/**
 * This program is example for Interface class
 * @author chandrashekar
 * @apiNote Interface program
 */
interface Vehicle {
  public void start();
}

class Car implements Vehicle {
  public void start() {
	System.out.println("Its's a Car class ");
    System.out.println("4 Wheeler");
  }
}

class Bike implements Vehicle{
public void start() {
	System.out.println("It's a Bike class");
    System.out.println("2 Wheeler \n");
  }
}

class InterfaceExample {
  public static void main(String[] args) {
    Bike bike = new Bike();
    bike.start();
    Car car = new Car();
    car.start();
  }
}

