	package _28_2_26;

public class product {
	public String productName;
	public int productId;
	public int productPrice;
	public void addProductDetails(String productName,int productId,int productPrice) {
		this.productName=productName;
		this.productId=productId;
		this.productPrice=productPrice;
	}
	public void displayDetails() {
		System.out.println("product name:"+productName);
		System.out.println("product id:"+productId);
		System.out.println("productprice:"+productPrice);
		
		
	}
	public static void main(String[] args) {
		product p= new product();
		p.addProductDetails("chocolate",20,40);
		p.displayDetails();
	}

}
