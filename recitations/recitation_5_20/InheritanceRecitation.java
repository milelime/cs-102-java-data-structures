class Vehicle {
  Integer tollAmount;
  Owner owner;

  Vehicle(Owner owner, Integer tollAmount) {
    this.owner = owner;
    this.tollAmount = tollAmount;
  }
}

class Owner {
  private String firstName;
  private String lastName;
  private String licensePlate;
  private Integer accountNumber;
  private Integer accountBalance = 100;

  public Owner(String firstName, String lastName, String licensePlate, Integer accountNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.licensePlate = licensePlate;
    this.accountNumber = accountNumber;
  }

  void deductToll(Integer tollAmount) {
    this.accountBalance = accountBalance - tollAmount;
  }

  Integer getAccountBalance() {
    return accountBalance;
  }
}

class Car extends Vehicle {
  Car(String firstName, String lastName, String licensePlate, Integer accountNumber) {
    Owner person = new Owner(firstName, lastName, licensePlate, accountNumber);

    super(person, 5);
  }
}

class Truck extends Vehicle {
  // can add an axle field
  Integer tollAmount = 9;

  Truck(String licensePlate, Integer accountNumber) {
    Owner person = new Owner(null, null, licensePlate, accountNumber);

    super(person, 9);
  }
}

class EmergencyVehicle extends Vehicle {
  // can add an axle field
  Integer tollAmount = 0;

  EmergencyVehicle(String licensePlate, Integer accountNumber) {
    Owner person = new Owner(null, null, licensePlate, accountNumber);

    super(person, 0);
  }
}

public class InheritanceRecitation {
  public static void main(String[] args) {
  }
}
