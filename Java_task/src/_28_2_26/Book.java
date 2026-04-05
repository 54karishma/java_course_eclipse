package _28_2_26;

public class Book {
	public String booktitle;
	public String author;
	public int isbn;
	public void addBookDetails( String booktitle, String author,int isbn) {
		this.booktitle=booktitle;
		this.author=author;
		this.isbn=isbn;
	}
	public void displayDetails() {
		System.out.println("book name:" +booktitle);
		System.out.println("author name:"+author);
		System.out.println("isbn:"+isbn);
		
	}
	public static void main(String [] args) {
		Book b=new Book();
		b.addBookDetails("Atomic Habits", "James Clea",123456);
		b.displayDetails();
	}

}
