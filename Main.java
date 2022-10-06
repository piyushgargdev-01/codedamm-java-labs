import java.util.Scanner;

interface Vehicle {
  String type = null;
  void deliver();
}

class Truck implements Vehicle {

  public String type;

  Truck(String type) {
    this.type = type;
  }

  @Override
  public void deliver() {
    System.out.println("Deliver products via " + this.type);
  }
}

class Ship implements Vehicle {

  public String type;

  Ship(String type) {
    this.type = type;
  }

  @Override
  public void deliver() {
    System.out.println("Deliver products via " + this.type);
  }
}

class Airplane implements Vehicle {

  public String type;

  Airplane(String type) {
    this.type = type;
  }

  @Override
  public void deliver() {
    System.out.println("Deliver products via " + this.type);
  }
}

class VehicleFactory {

  public static Vehicle getVehicle(int load) {
    Vehicle object = null;

    if (load < 100) {
      // Truck
      object = new Truck("Truck");
    } else if (load > 100 && load < 400) {
      // Airplane
      object = new Airplane("Airplane");
    } else {
      // Ship
      object = new Ship("Ship");
    }

    return object;
  }
}

public class FactoryPattern {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int load = scanner.nextInt();

    Vehicle vehicle = VehicleFactory.getVehicle(load);
    vehicle.deliver();
  }
}
