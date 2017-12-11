package lesson6_singletons;

public enum SingletonAsEnum {
	INSTANCE;
	public void printHello() {
		System.out.println("Hello");
	}
}

//See how it works
class TestSingleton {
	public static void main(String[] args) {
		SingletonAsEnum instance = SingletonAsEnum.INSTANCE;
		instance.printHello();
	}
}
