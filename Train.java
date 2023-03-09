import java.util.ArrayList;

public class Train {
    private final Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.cars = new ArrayList <Car> (nCars);
        this.engine = new Engine(fuelType, fuelCapacity);
        // Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        // this.engine = myEngine;
    }

    public Engine getengine(){
        return engine;
    }

    public Car getcar(int i){
        return cars.get(i);
    }

    public int getMaxCapacity(){
        int maxcapacity = 0;
        for (Car c: this.cars){
            maxcapacity = c.getcapacity() + maxcapacity;
        }
        return maxcapacity;
    }

    public int seatsremaining(){
        int seatsremaining = 0;
        for (Car c: this.cars){
            seatsremaining = c.seatsremaining() + seatsremaining;
        }
        return seatsremaining;
    }

    // public void printManifest(Object c){
        
    // }

    public static void main(String[] args) {
        Train trainA = new Train(FuelType.ELECTRIC, 100, 3, 5);
        
    }


}
