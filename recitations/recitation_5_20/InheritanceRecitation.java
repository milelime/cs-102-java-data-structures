class Vehicle {
  Integer tollAmount;
  Owner owner;

  public Vehicle(Integer tollAmount) {
    this.tollAmount = tollAmount;
  }

  public void crossBridge() {
    owner.deductToll(tollAmount);
    System.out
        .println("Total balance for accountNumber " + owner.getAccountNumber() + " is " + owner.getAccountBalance());
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

  public void deductToll(Integer tollAmount) {
    this.accountBalance = accountBalance - tollAmount;
  }

  public Integer getAccountBalance() {
    return accountBalance;
  }

  public Integer getAccountNumber() {
    return accountNumber;
  }
}

class Car extends Vehicle {
  public Car(String firstName, String lastName, String licensePlate, Integer accountNumber) {

    super(5);
    Owner person = new Owner(firstName, lastName, licensePlate, accountNumber);
    super.owner = person;
  }

  public void crossBridge() {
    super.crossBridge();
  }
}

class Truck extends Vehicle {
  // can add an axle field
  Integer tollAmount = 9;

  public Truck(String licensePlate, Integer accountNumber) {

    super(9);
    Owner corporateOwner = new Owner(null, null, licensePlate, accountNumber);
    super.owner = corporateOwner;
  }

  public void crossBridge() {
    super.crossBridge();
  }
}

class EmergencyVehicle extends Vehicle {
  // can add an axle field
  Integer tollAmount = 0;

  public EmergencyVehicle(String licensePlate, Integer accountNumber) {

    super(0);
    Owner governmentOwner = new Owner(null, null, licensePlate, accountNumber);
    super.owner = governmentOwner;
  }

  public void crossBridge() {
    super.crossBridge();
  }
}

public class InheritanceRecitation {
  public static void main(String[] args) {
    EmergencyVehicle copCar = new EmergencyVehicle("ABC123", 1234);
    Truck peterbilt = new Truck("TTRUCK", 444444);
    Car honda = new Car("Bob", "Smith", "B4B123", 123908);

    peterbilt.crossBridge();
    copCar.crossBridge();
    honda.crossBridge();

  }
}
