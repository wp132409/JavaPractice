/**
 * 
 */
package org.dimigo.oop;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *    |_StudentTest
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 17.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(13, 2, 3, 1, "이름없음", "주소없음", "핸드폰없음");
		Student s2 = new Student(13, 2, 3, 2, "박명수", "주소없음", "핸드폰없음");
		Student s3 = new Student(13, 2, 3, 3, "정준하", "안산시", "핸드폰없음");
		Student s4 = new Student(13, 2, 3, 4, "정형돈", "서울시", "010-444-4444");
		
		s1.printStudent();
		s2.printStudent();
		s3.printStudent();
		s4.printStudent();
		
		s1.setName("유재석");
		s1.setAddress("수유리");
		s1.setPhone("010-111-1111");
		
		s2.setAddress("서래마을");
		s2.setPhone("010-222-2222");
		
		s2.setPhone("010-333-3333");
		
		System.out.println("--------------------------");
	}
	
}
