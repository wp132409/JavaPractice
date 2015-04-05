package org.dimigo.basic;
/**
 * 디미베네 연간 인건비 계산하기
 * 
 * @author HyunWooKim
 *
 */

public class Promotion {

	public static void main(String[] args) {
		
		int salary = 1700000;
		int clerk = 3;
		int store = 1500;
		
		long yearMoney = (long)salary * 12 * (long)clerk * (long)store;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.format("월 평균 급여 : %,d원\n",salary);
		System.out.format("점포 내 직원 수 : %,d명\n",clerk);
		System.out.format("점포 수 : %,d개\n",store);
		
		System.out.format("\n\n연간 인건비 : %,d원", yearMoney);
		
	}

}