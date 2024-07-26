package Nesnetemel;
public class main {

	public static void main(String[] args) {
		//encapculation
		//inheritance
		//polymorphism
		//abstraction
		Book b1=new Book("Harry Potter", 400, "Rowling", "kodlama");
		b1.setterPageSize(-400);
		System.out.println(b1.getterPageSize());
		Book b2=new Book("Lord of the ",500,"Peter Jackson","Kodlama");
		b2.setName("Lord Of The Rings");
		System.out.println(b2.getName());
	}

}
