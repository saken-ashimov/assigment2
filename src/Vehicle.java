public abstract class Vehicle {
    private final int id;
    private static int idGen = 1;
    private String model;
    private int year;
    private double basePrice;

    // Constructors
    public Vehicle(String model, int year, double basePrice){
        setYear(year);
        setBasePrice(basePrice);
        setModel(model);
        this.id = idGen++;
    }

    // Setters
    public void setYear(int year) {
        if (year <= 1960 || year >= 2026)
            throw new IllegalArgumentException("Invalid year");
        this.year = year;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice < 0)
            throw new IllegalArgumentException("basePrice must be greater than 0");
        this.basePrice = basePrice;

    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid model name");
        }
        this.model = model;
    }

    public int getYear() { return year; }
    public double getBasePrice() {return basePrice; }
    public String getModel() { return model; }
    public int getId() { return  id; }


    // Methods

    public int getAge(int currentYear) {
        if (currentYear < year) {
            throw new IllegalArgumentException("currentYear can't be less than vehicle year");
        }
        return (currentYear - this.year);
    }

    public abstract double calculateInsuranceFee();


}
