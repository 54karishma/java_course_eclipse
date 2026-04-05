package _5_3_26_blc_elc;

public class Library {
	public static void main(String [] args) {
		Book b1=new Book();
		Book b2=new Book();
		b1.setId(222);
		b1.setTitle("Animal Farm");
		b1.setAuthor("George Orwell");
		b1.setPrice(200.0);
		System.out.println("Book1 id:" +b1.getId());
		System.out.println("book1 title:" +b1.getTitle());
		System.out.println("book1 author:" +b1.getAuthor());
		System.out.println("book1 price:" +b1.getPrice());
		b2.setId(333);
		b2.setTitle("Small Remedies");
		b2.setAuthor("Shashi Deshpande");
		b2.setPrice(250.0);
		System.out.println("Book2 id:" +b2.getId());
		System.out.println("book2 title:" +b2.getTitle());
		System.out.println("book2 author:" +b2.getAuthor());
		System.out.println("book2 price:" +b2.getPrice());
		
		
		
		
	}

}
