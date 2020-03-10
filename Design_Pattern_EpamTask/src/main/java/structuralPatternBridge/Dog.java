package structuralPatternBridge;

public class Dog extends Animal{
	private int timesADay, amount;
    private String typeOfFood;
    
    public Dog(int timesADay, int amount, String typeOfFood, FeedingAPI feedingAPI) {
        super(feedingAPI);
        this.timesADay = timesADay;
        this.amount = amount;
        this.typeOfFood = typeOfFood;
    }
    
  
    public String feed() {
        feedingAPI.feed(timesADay, amount, typeOfFood);
        return "Feeding a big dog, " + timesADay + " times a day with " + 
        	amount + " g of " + typeOfFood;
    }
}
