public class Bus extends Vehicle {
    private int passengerCapacity;

    //Construct
    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        setPassengerCapacity(passengerCapacity);

    }
    //setter
    public void setPassengerCapacity (int passengerCapacity) {
        if (passengerCapacity < 4 || passengerCapacity > 125)
            throw new IllegalArgumentException("Invalid number of passenger");
        this.passengerCapacity = passengerCapacity;
    }

    //getter


    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        int currentYear = 2025;
        int age = getAge();


        return getBasePrice() * 0.1 + age * 20 + passengerCapacity * 10;
    }

    @Override
    public String toString() {
        return super.toString() + ", passengerCapacity=" + passengerCapacity;
    }

}
