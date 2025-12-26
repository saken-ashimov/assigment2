public class Main {
    public static void main(String[] args) {
        Vehicle c = new Car("Camry", 2018, 12000, 4);

        Vehicle b = new Bus("Ford", 2009, 20000, 30);
        System.out.println(c.toString());
        System.out.println(c.getAge());

        System.out.println(b.calculateInsuranceFee());
        System.out.println(b.toString());
        System.out.println(c.getAge());


        Servicable s = new Car("Audi", 2019, 50000, 2);
        s.performService();

        Servicable s2 = new Bus("BMW", 2015, 50000, 6);
        s2.performService();

        System.out.println("Car interval: " + s.getServiceIntervalKm() + " km");
        System.out.println("Bus interval: " + s2.getServiceIntervalKm() + " km");
    }
}

