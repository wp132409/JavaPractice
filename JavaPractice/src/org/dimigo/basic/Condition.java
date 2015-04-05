package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {

		String vehicle = "고속버스";
		int distance = 10;
		int price = 0, check;

		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + vehicle);

		switch (vehicle) {
		case "고속버스":
			price = 850;
			check = distance / 10;
			if (distance % 10 == 0) {
				for (int i = 1; i < check; i++) {
					price = price + 300;
				}
			} else if (distance % 10 != 0) {
				for (int i = 0; i < check; i++) {
					price = price + 300;
				}
			}
			break;
		case "경차":
			price = 300;
			check = distance / 10;
			if (distance % 10 == 0) {
				for (int i = 1; i < check; i++) {
					price = price + 200;
				}
			} else if (distance % 10 != 0) {
				for (int i = 0; i < check; i++) {
					price = price + 200;
				}
			}
			break;
		default:
			price = 600;
			check = distance / 10;
			if (distance % 10 == 0) {
				for (int i = 1; i < check; i++) {
					price = price + 200;
				}
			} else if (distance % 10 != 0) {
				for (int i = 0; i < check; i++) {
					price = price + 200;
				}
			}
			break;
		}
		System.out.println("통행료 : " + price + "원");
	}
}