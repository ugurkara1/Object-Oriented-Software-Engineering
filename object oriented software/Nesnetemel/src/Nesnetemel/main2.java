package Nesnetemel;

public class main2 {

	public static void main(String[] args) {
		//sınıflar arası ilişkiler
		// -Bağımlılık(Dependency) "uses a" A uses B
		// -Birleştirme (composition) "has a" a.b=b
		// -kalıtım (inheritance) "is a"
		
		A a=new A();
		B b=new B();
		a.run(b);
	}

}
