package structuralPatternBridge;

public class Main {
	public static void main(String[] args) {
        Animal bigDog = new Dog(3, 500, "Meat", new BigDog());
        Animal smallDog = new Dog(2, 250, "Granules", new SmallDog());
      
        System.out.println(bigDog.feed());
        smallDog.feed();
    }
}
