public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    public void boardcar(Car c){
        try {
            c.addPassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void getOffCar(Car c){
        try {
            c.removePassenger(this);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        Passenger jimmy = new Passenger("Jimmy");
        Passenger henry = new Passenger("Henry");
        Passenger jason = new Passenger("Jason");
    }
}
