/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * 
 * <pre>
 * org.dimigo.inheritance
 *    |_SmartPhoneTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		IPhone iphone = new IPhone("iPhone 6", "애플", 700000);
		Galaxy galaxy = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(iphone.toString());
		iphone.turnOn();
		iphone.pay();
		iphone.useSpecialFunction();
		iphone.turnOff();
		
		System.out.println("-----------------------------");
		
		System.out.println(galaxy.toString());
		galaxy.turnOn();
		galaxy.pay();
		galaxy.useSpecialFunction();
		galaxy.turnOff();
		
	}
}
