package com.tnsif.daytwo;

public class EncapsulationDemo {
	
	private int SerialNumber;
	private float Price;
	private String LaptopName;
	
	public int getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		SerialNumber = serialNumber;
	}
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	public String getLaptopName() {
		return LaptopName;
	}
	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}
	@Override
	public String toString() {
		return "EncapsulationDemo [ SerialNumber = " + getSerialNumber() + ", Price = " + getPrice()
				+ ", LaptopName = " + getLaptopName() + "]";
	}

}
