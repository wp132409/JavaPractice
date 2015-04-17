/**
 * 
 */
package org.dimigo.oop;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *    |_Student
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 17.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class Student {
	private int gisu;
	private int grade;
	private int ban;
	private int number;
	private String name;
	private String address;
	private String phone;
	
	public Student() {
		
	}
	
	public Student(int gisu, int grade, int ban, int number, String name, String address, String phone) {
		this.gisu = gisu;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	
	public Student(int gisu, int grade, int ban, int number, String name, String address) {
		this.gisu = gisu;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
		this.name = name;
		this.address = address;
	}
	
	public Student(int gisu, int grade, int ban, int number, String name) {
		this.gisu = gisu;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
		this.name = name;
	}
	
	public Student(int gisu, int grade, int ban, int number) {
		this.gisu = gisu;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
	}
	
	public void printStudent() {
		if(name == null) name = "이름없음";
		if(address == null) address = "주소없음";
		if(phone == null) phone = "휴대폰없음";
			
		System.out.println("<< 학생 정보 출력 >>");
		System.out.println("1. 학번 : " + gisu + grade + ban + String.format("%02d", number));
		System.out.println("2. 이름 : " + name);
		System.out.println("3. 주소 : " + address);
		System.out.println("4. 휴대폰번호 : " + phone);
		System.out.println();
	}
}
