/**
 * 
 */
package org.dimigo.thread;

/**
 * 
 * <pre>
 * org.dimigo.thread
 *    |_Race
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class Race {
	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread t1 = new Runner("홍길동");
		Thread t2 = new Runner("홍길순");
				
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}
}
