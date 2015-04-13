/**
 * 
 */
package org.dimigo.oop;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *    |_Car
 * 
 * 1. 개요 : 차 객체
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class Car {

	/**
	 * @param args
	 */
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String newCompany) {
		company = newCompany;
	}

	public void setModel(String newModel) {
		model = newModel;
	}
	
	public void setColor(String newColor) {
		color = newColor;
	}
	
	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newPrice) {
		price = newPrice;
	}

}