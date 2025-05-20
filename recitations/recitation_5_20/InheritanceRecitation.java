class Vehicle {
  Integer tollAmount;
  Owner owner;
}

class Owner {
  private String firstName;
  private String lastName;
  private String licensePlate;
  private Integer accountNumber;

  public Owner(String firstName, String lastName, String licensePlate, Integer accountNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.licensePlate = licensePlate;
    this.accountNumber = accountNumber;
  }
}

class Car extends Vehicle {
  Integer tollAmount = 3;

  Car(String firstName, String lastName, String licensePlate, Integer accountNumber) {
    Owner person = new Owner(firstName, lastName, licensePlate, accountNumber);
  }
}

class Truck extends Vehicle {
}

class EmergencyVehicle extends Vehicle {
}

public class InheritanceRecitation {
  public static void main(String[] args) {

  }
}
