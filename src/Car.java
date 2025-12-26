public class Car extends Vehicle {
    private int numberOfDoors;


    //Construct
    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        setNumberOfDoors(numberOfDoors);
    }


    // setter
    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors < 2 || numberOfDoors > 6) {
            throw new IllegalArgumentException("Invalid number of doors");
        }
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        int age = getAge();

        return getBasePrice() * 0.1 + age * 20 + numberOfDoors * 5;
    }

    @Override
    public String toString() {
        return super.toString() + ", doors=" + numberOfDoors;
    }
}


