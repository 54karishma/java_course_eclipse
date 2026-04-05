package _5_3_26_blc_elc;

public class Car {
	int carId;
	String carBrand;
	String carModel;
	double PricePreDay;
	public void setId(int id) {
		carId=id;
		
	}
	public void setBrand(String brand) {
		carBrand=brand;
	}
	public void setModel(String model) {
		carModel=model;
	}
	public void setPrice(double price) {
		PricePreDay=price;
	}
	public int getId() {
		return carId;
	}
	public String getBrand() {
		return carBrand;
	}
	public String getModel() {
		return carModel;
	}
	public double getPrice() {
		return PricePreDay;
	}
	

}
