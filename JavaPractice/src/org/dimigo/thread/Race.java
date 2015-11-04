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
				
		// MAX_PRIORITY(10), NORM_PRIORITY(5), MIN_PRIORITY(1)
		// 우선순위가 높은 스레드가 실기회를 더 많이 가진다.
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}
}
