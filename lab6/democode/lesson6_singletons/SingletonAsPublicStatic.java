package lesson6_singletons;

public class SingletonAsPublicStatic {
	public static final SingletonAsPublicStatic INSTANCE 
		= new SingletonAsPublicStatic();
	
	private SingletonAsPublicStatic() {}
	
	public static void main(String[] args) {
		SingletonAsPublicStatic singleton1 =
			SingletonAsPublicStatic.INSTANCE;

		
	}
}
