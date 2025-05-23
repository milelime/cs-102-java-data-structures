abstract class Owner {
    private final String licensePlate;

    Owner(final String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract void print();
}

class PersonOwner extends Owner {
    private final String firstName;
    private final String lastName;

    PersonOwner(final String firstName, final String lastName, final String licensePlate) {
        super(licensePlate);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNameInOrder() {
        return firstName + " " + lastName;
    }

    public String getNameInReverseOrder() {
        return lastName + ", " + firstName;
    }

    @Override
    public void print() {
        System.out.printf("Person Owner -- License Plate: %s; Name: %s\n", getLicensePlate(), getNameInOrder());
    }
}

class CorporationOwner extends Owner {
    CorporationOwner(final String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void print() {
        System.out.printf("Corporation Owner -- License Plate: %s\n", getLicensePlate());
    }
}

class GovernmentOwner extends Owner {
    GovernmentOwner(final String licensePlate) {
        super(licensePlate);
    }

    @Override
    public void print() {
        System.out.printf("Government Owner -- License Plate: %s\n", getLicensePlate());
    }
}

abstract class Account {
    private static final int DEFAULT_BALANCE = 100;
    private int balance = DEFAULT_BALANCE;
    private final int id;
    private final int expectedCharge;
    private final Owner owner;

    Account(final int id, final int expectedCharge, final Owner owner) {
        this.id = id;
        this.expectedCharge = expectedCharge;
        this.owner = owner;
    }

    public void chargeToll() {
        if (balance >= expectedCharge) {
            final int prevBalance = balance;
            balance -= expectedCharge;
            System.out.printf("$%d deducted from account %d\n", expectedCharge, id);
            System.out.printf("Previous balance: $%d; Current balance: $%d\n", prevBalance, balance);
        } else {
            System.out.printf("Account %d has insufficient funds to pay this toll for %d. Current balance: $%d\n", id,
                    expectedCharge, balance);
        }
    }

    public void print() {
        owner.print();
        System.out.printf("ID: %d; Balance: $%d\n", id, balance);
    }
}

class Car extends Account {
    private static final int CAR_TOLL = 5;

    Car(final int id, final String firstName, final String lastName, final String licensePlate) {
        super(id, CAR_TOLL, new PersonOwner(firstName, lastName, licensePlate));
    }
}

class Truck extends Account {
    private static final int TRUCK_TOLL_PER_AXLE = 3;

    Truck(final int id, final int axles, final String licensePlate) {
        super(id, axles * TRUCK_TOLL_PER_AXLE, new CorporationOwner(licensePlate));
    }
}

class EmergencyVehicle extends Account {
    EmergencyVehicle(final int id, final String licensePlate) {
        super(id, 0, new GovernmentOwner(licensePlate));
    }
}

public class Tolls {
    public static void main(final String[] args) {
        final Car honda = new Car(123, "Bob", "Shmingler", "123ABC");
        final Truck peterbilt = new Truck(1280, 4, "TR4CK4L1F3");
        final EmergencyVehicle ambulance = new EmergencyVehicle(1823, "888888");

        honda.chargeToll();
        honda.chargeToll();
        honda.chargeToll();
        honda.chargeToll();
        honda.chargeToll();
        honda.chargeToll();
        honda.chargeToll();
        honda.print();

        peterbilt.chargeToll();
        peterbilt.print();
        peterbilt.chargeToll();
        peterbilt.chargeToll();
        peterbilt.chargeToll();
        peterbilt.print();
        peterbilt.chargeToll();
        peterbilt.chargeToll();
        peterbilt.chargeToll();
        peterbilt.print();
        peterbilt.chargeToll();
        peterbilt.print();
        peterbilt.chargeToll();
        peterbilt.chargeToll();
        peterbilt.print();

        ambulance.print();
        ambulance.chargeToll();
        ambulance.chargeToll();
        ambulance.chargeToll();
        ambulance.chargeToll();
        ambulance.print();
        ambulance.print();
        ambulance.chargeToll();
        ambulance.chargeToll();
        ambulance.chargeToll();
        ambulance.chargeToll();
        ambulance.chargeToll();
        ambulance.chargeToll();
        ambulance.print();
    }
}

/**
 * An application tracks the amount that account owed for tolling charges. These
 * charges are accrued when crossing a bridge. There are 3 types of accounts:
 * one for cars, one for trucks and one for emergency vehicles. Cars have a
 * person owner with a first and last name, a license plate, and an account
 * number. When a car crossed a bridge the charge is $5. Trucks have a
 * corporation owner, a license plate, and an account number. When a truck
 * crosses the bridge, it is charged $3 per axle. Emergency vehicles are also in
 * the system, but cross the bridge for free. These emergency vehicles have a
 * government owner, an account number and a license plate.
 * 
 * Make classes for all types of vehicles, with all properties mentioned, using
 * inheritance when possible. Each class should have a method that can be called
 * when the vehicle crosses the bridge. The method should keep track of how much
 * the account owes.
 * 
 * In addition to the classes, write some code in a main method that creates
 * some vehicles, post some tolls and prints out their account balance. Your
 * main method code should verify that the method called for each crossing
 * accurately keeps the account balance.
 */
