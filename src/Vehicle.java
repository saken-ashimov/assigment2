public abstract class Vehicle {
    private final int id;
    private static int idGen = 1;
    private String model;
    private int year;
    private double basePrice;

    protected static final int CURRENT_YEAR = 2025;
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

    public int getAge() {
        return (CURRENT_YEAR - this.year);
    }
    // Methods


    public abstract double calculateInsuranceFee();

    @Override
    public String toString() {
        return "id=" + id + ", model= " + model + ", year=" + year + ", basePrice=" + basePrice;
    }
}
