package CreationalPatternSingleton;

public class SingletonClass {
	private static SingletonClass instance = new SingletonClass();
	   
    public SingletonClass() {}
    
    public static SingletonClass getInstance() {
    	System.out.println(instance);
        return instance;
        
    }
    
    public String showMessage() {
        return("I'm a singleton object!");   
    }
}
