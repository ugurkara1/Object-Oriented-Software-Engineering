package Nesnetemel;

public class Book {
	public String name,author,publisher;
	private int numberOfPage; //private
	public Book(String name,int numberOfPage,String author,String publisher) {
		this.name=name;
		this.numberOfPage=numberOfPage;
		this.author=author;
		this.publisher=publisher;
		if(numberOfPage<1) {
			this.numberOfPage=10;
		}
		else {
			this.numberOfPage=numberOfPage;
		}
	}
	/*public void pageSize() {
		System.out.println(numberOfPage);
	}*/
	public int getterPageSize() {
		return numberOfPage;
	}
	public void setterPageSize(int size) {
		if(size<1) {
			System.out.println("sayfa sayısı negatif olamaz");
			this.numberOfPage=10;
		}
		else {
			this.numberOfPage=size;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
