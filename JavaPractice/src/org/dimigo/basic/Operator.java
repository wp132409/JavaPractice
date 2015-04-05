package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 10;
		double h1 = 5.8;
		double h2 = 5.4;
		
		double ladder = (a + b)*h1/2;
		double square = a*h2;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.printf("사다리꼴 넓이 : %.1f\n",ladder);
		System.out.printf("평행사변형 넓이 : %.1f\n\n\n",square);
		
		if(ladder > square) {
			System.out.printf("사다리꼴이 평행사변형 보다 %.1f 더 큽니다.\n", ladder-square);
		} else if(square > ladder) {
			System.out.printf("평행사변형이 사다리꼴 보다 %.1f 더 큽니다.\n", square-ladder);
		} else if(square == ladder) {
			System.out.println("두 도형의 넓이는 같습니다.");
		}
	}

}