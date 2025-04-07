public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("porche");
        runRace(car);

        Car ferrai = new GasPoweredCar("Honda");
        runRace(ferrai);

        Car tesla = new ElectricCar("Musk");
        runRace(tesla);

        Car toyata = new HybridCar("RV3");
        runRace(toyata);


    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
class Car{
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car-> Start Enginee");

    }
    protected void runEngine(){
        System.out.println("car -> Enginee Runnning");
    }
    public void drive(){
        System.out.println("car is Driving ,type is " + getClass().getSimpleName());
        runEngine();
    }
}
class GasPoweredCar extends Car {
    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Gas start enginee");
    }

    @Override
    protected void runEngine() {
        System.out.println("gas run engine");
    }
}


class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("electric enginee");
    }

    @Override
    protected void runEngine() {
        System.out.println("Electric run engine");
    }
}


class HybridCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerCharge, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println("Hybrid enginee");
    }

    @Override
    protected void runEngine() {
        System.out.println("Hybrid run engine");
    }
}







