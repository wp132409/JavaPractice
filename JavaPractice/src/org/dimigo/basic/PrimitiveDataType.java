package org.dimigo.basic;

/**
 * << 첫번째 수행평가 과제 >>
 * 
 * 지금까지 배운 자료형을 사용하여 아래 내용을 출력해 보자.
 * - 이름(String), 성별(boolean), 나이(int), 키(double), 몸무게(float), 혈액형(char)
 * 
 * << 아이유 프로필 >>
 * 이름 : 아이유
 * 성별 : 여자
 * 나이 : 23 세
 * 키 : 161.8 cm
 * 몸무게 : 44.3 kg
 * 혈액형 : A 형
 * 
 * @author HyunWooKim
 *
 */
public class PrimitiveDataType {

	public static void main(String[] args) {

		String name = "아이유";
		boolean gender = true;
		int old = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + name);
		if(gender == true) {
			System.out.println("성별 : 여자");
		} else System.out.println("성별 : 남자");
		System.out.println("나이 : " + old + "세");
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("몸무게 : %.1fkg\n", weight);
		System.out.println("혈액형 : "+bloodType + "형");
	}

}