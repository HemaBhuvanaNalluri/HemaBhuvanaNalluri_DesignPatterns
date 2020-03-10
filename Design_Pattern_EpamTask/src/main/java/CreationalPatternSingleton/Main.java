package CreationalPatternSingleton;

public class Main {
	public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass.showMessage());
    }
}
