/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *    |_Question
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String country = "대한민국";
		String name = "김현우";
		String school = "한국디지털미디어고등학교";
		
		String userCountry;
		String userName;
		String userSchool; 
		
		System.out.println("당신의 국적은?");
		userCountry = scanner.nextLine();
		
		if(country.equals(userCountry)) {
			System.out.println("정답입니다!! ^^\n");
		} else System.out.println("틀렸습니다!! ㅠ\n");
		
		System.out.println("당신의 이름은?");
		userName = scanner.nextLine();
		
		if(userName.equals(name)) {
			System.out.println("정답입니다!! ^^\n");
		} else System.out.println("틀렸습니다!! ㅠ\n");
		
		System.out.println("당신의 학교는?");
		userSchool = scanner.nextLine();
		
		if(school.equals(userSchool)) {
			System.out.println("정답입니다!! ^^\n");
		} else System.out.println("틀렸습니다!! ㅠ\n");
		
		scanner.close();
		
	}

}
