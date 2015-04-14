/**
 * 
 */
package org.dimigo.oop;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *    |_Car2
 * 
 * 1. 개요 : 생성자를 이용한 초기값 설정
 * 2. 작성일 : 2015. 4. 14.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class Car2 {

	/**
	 * @param args
	 */
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car2(){
		
	}
	
	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
	}
	
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
}