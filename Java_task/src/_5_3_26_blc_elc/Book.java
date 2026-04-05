package _5_3_26_blc_elc;

public class Book {
	int bookId;
	String title;
	String author;
	double price;
	public void setId(int id) {
		bookId=id;
	}
	public void setTitle(String tit) {
		title=tit;
	}
	public void setAuthor(String writer) {
		author=writer;
	}
	public void setPrice(double pri) {
		price=pri;
	}
	public int getId() {
		return bookId;
	}
	public String getTitle() {
		return title;
		
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	
	
	

}
