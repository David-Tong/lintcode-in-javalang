public class Main {
    public static void main(String[] args) {
    	Coffee groundCoffee = new GroundCoffee();
        groundCoffee.MakeCoffee();
        Coffee brewingCoffee = new BrewingCoffee();
        brewingCoffee.MakeCoffee(); 
        System.out.println("Enjoy your coffee!");
    }
}