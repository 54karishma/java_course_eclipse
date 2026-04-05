package _5_3_26_blc_elc;
public class product {
	int productId;
	String productName;
	double productPrice;
	int productQuantity;
	public void setId(int id) {
		productId=id;
	}
	public void setName(String name) {
		productName=name;
	}
	public void setPrice(double price) {
		productPrice=price;
	}
	public void setQuantity(int quantity) {
		productQuantity=quantity;
	}
	public int getId() {
		return productId;
	}
	public String getName() {
		return productName;
	}
	public double getPrice() {
		return productPrice;
	}
	public int getQuantity() {
		return productQuantity;
	}
}
