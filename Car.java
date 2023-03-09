import java.util.ArrayList;

public class Car {
    private ArrayList<Passenger> passengersonboard;
    private int maxcapacity;
    
    public Car(int maxcapacity){
        this.maxcapacity = maxcapacity;
        this.passengersonboard = new ArrayList<Passenger> (maxcapacity);
    }
    public int getcapacity(){
        return maxcapacity;
    }

    public int seatsremaining(){
        return maxcapacity - this.passengersonboard.size();
    }

    public void addPassenger(Passenger p){
        try{
            this.passengersonboard.add(p);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("This car is full. Please select a different car.");
        }
    }

    public void removePassenger(Passenger p){
        if (this.passengersonboard.contains(p)){
            System.out.printf("Removing ", p, " from this car...");
            this.passengersonboard.remove(p);
            throw new RuntimeException("That passenger is not in this car.");
        }
    }

    public void printManifest(){
        for (int i = 0; i < passengersonboard.size(); i++){
            System.out.println(passengersonboard.get(i));
            if (passengersonboard.isEmpty()){
            System.out.println("This car is empty");
            }
        }
    }

    public static void main(String[] args) {
        Car carA = new Car(2);
        Car carB = new Car(2);
        Car carC = new Car(2);
        Passenger jimmy = new Passenger("Jimmy");
        Passenger henry = new Passenger("Henry");
        Passenger jason = new Passenger("Jason");
        carA.addPassenger(jimmy);
        carA.addPassenger(henry);
        carA.addPassenger(jason);
        carA.printManifest();


    }


}