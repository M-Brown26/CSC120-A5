public class Engine {
    private FuelType f;
    double currentFuelLevel;
    double maxFuelLevel;

    public Engine(FuelType f, double maxFuelLevel){
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel;
    }
    
    public void refuel(){
        currentFuelLevel = maxFuelLevel;
    }

    public void go(){
        currentFuelLevel = currentFuelLevel - 10;
    while (this.currentFuelLevel > 0){
            System.out.print("There is ");
            System.out.print(maxFuelLevel - currentFuelLevel);
            System.out.print(" fuel left");
        }
        if (this.currentFuelLevel == 0){
                throw new RuntimeException("Fuel tank is empty. Please refuel.");
        }
    }
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        myEngine.go();
        // try {
        //     while (true) {
        //         myEngine.go();
        //     }
        // } catch (Exception e) {
        //     System.err.println(e.getMessage()); // Out of fuel
        
    }

}