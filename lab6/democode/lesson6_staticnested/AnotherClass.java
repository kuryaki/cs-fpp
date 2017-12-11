package lesson6_staticnested;

class AnotherClass {
	public static void main(String[] args){
		MyClass.MyStaticNestedClass cl = 
					new MyClass.MyStaticNestedClass(); //OK
		
		MyClass m = new MyClass();
		//the following is illegal-- compiler error
//		MyClass.MyStaticNestedClass cl2 = m.new MyStaticNestedClass();
	}
}
