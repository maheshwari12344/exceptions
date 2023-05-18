package com.onesoft.collections2;

public class Car {
private int chasisNumber;
private String brand;
private int price;
private String colour;
private String model;
public int getChasisNumber() {
	return chasisNumber;
}
public void setChasisNumber(int chasisNumber) {
	this.chasisNumber = chasisNumber;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public Car(int chasisNumber, String brand, int price, String colour, String model) {
	super();
	this.chasisNumber = chasisNumber;
	this.brand = brand;
	this.price = price;
	this.colour = colour;
	this.model = model;
}
@Override
public String toString() {
	return "Car chasisNumber=" + chasisNumber + ", brand=" + brand + ", price=" + price + ", colour=" + colour+", Model="+model+"\n";
}


}





