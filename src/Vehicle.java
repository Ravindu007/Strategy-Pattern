public class Vehicle {

    private PropulsionStrategy _propulsionsStrategy;

    public  Vehicle(PropulsionStrategy ps){
        this._propulsionsStrategy = ps;
    }

    public void drive(){
        _propulsionsStrategy.drive();
    }
    public static void main(String[] args) {

        Vehicle car = new Vehicle(new DriveStrategy());
        car.drive();

        Vehicle flight = new Vehicle(new FlyingStrayegy());
        flight.drive();

    }
}