package lesson6_singletons;

/** Developed by the creators of Spring */
public class SingletonAsStaticNestedClass {

	private static class MySingletonHolder {

		static SingletonAsStaticNestedClass instance = new SingletonAsStaticNestedClass();
	}

	private SingletonAsStaticNestedClass() {
		System.out.println("constructing now...");
	}

	public static SingletonAsStaticNestedClass getInstance() {
		System.out.println("call to getInstance()");
		return MySingletonHolder.instance;
	}

	public static void main(String[] args) {
		System.out.println("Main method first call");
		// comment out and you see the instance is not created
		SingletonAsStaticNestedClass.getInstance();
	}

}
