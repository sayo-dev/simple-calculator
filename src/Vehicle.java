class Vehicle {

    String model;
    int yearOfMake;

    public Vehicle() {
    }

    Vehicle(String model, int yearOfMake) {
        this.model = model;
        this.yearOfMake = yearOfMake;
    }

    void speed() {
        System.out.println("This car is speeding");
    }

}
