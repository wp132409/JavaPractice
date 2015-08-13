/**
 * 
 */
package org.dimigo.inheritance;

/**
 * 
 * <pre>
 * org.dimigo.inheritance
 *    |_Figure
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class Figure {
	
	private int centerX;
	private int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 0.0;
	}
	
	protected void printCenter() {
		System.out.println("중심좌표 : ("+centerX + ", " + centerY + ")");
	}
	
	protected void moveFigure(int x, int y) {
		System.out.println("--중심좌표 이동 (x축 : " + x + "이동 y축 : " + y + "이동)");
		this.centerX = centerX + x;
		this.centerY = centerY + y;

	}
	
}
