/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * 
 * <pre>
 * org.dimigo.oop
 *    |_Score
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 => ");
		int kScore = scanner.nextInt();
		
		System.out.print("수학 점수 입력 => ");
		int mScore = scanner.nextInt();
		
		System.out.print("영어 점수 입력 => ");
		int eScore = scanner.nextInt();
		
		double avg = (kScore + mScore + eScore) / 3;
		
		//==================================
		
		System.out.println("<점수 출력>\n");
		String ScoreSb = new StringBuilder("국어 점수 : ")
								.append(kScore)
								.append(" 점")
								.append("\n")
								.append("수학 점수 : ")
								.append(mScore)
								.append(" 점")
								.append("\n")
								.append("영어 점수 : ")
								.append(eScore)
								.append(" 점")
								.append("\n")
								.append("평균 : ")
								.append(String.format("%.1f", avg))
								.append(" 점")
								.append("\n")
								.append("총점 : ")
								.append(kScore + mScore + eScore)
								.append(" 점").toString();
		scanner.close();
		
		System.out.println(ScoreSb);
		
	}
}
