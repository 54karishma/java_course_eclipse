package _5_3_26;

public class product {
	String productName;
	int productId;
	int productprice;
	public void addProductDetails(String name,int id ,int price) {
		productName=name;
		productId=id;
		productprice=price;
		
		
	}
	public String displayProductDetails() {
		return "productName:" +productName+ "  productId:" +productId+ "  productprice :" +productprice;
	}
	public static void main(String[] args){
		product p= new product();
		p.addProductDetails("phone", 45, 30000);
		System.out.println(p.displayProductDetails());
		
		
	}

}
