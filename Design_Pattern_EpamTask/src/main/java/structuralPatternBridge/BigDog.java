package structuralPatternBridge;

public class BigDog implements FeedingAPI {
	
    public String feed(int timesADay, int amount, String typeOfFood) {
        return "Feeding a big dog, " + timesADay + " times a day with " + 
            amount + " g of " + typeOfFood;
       
    }
}
