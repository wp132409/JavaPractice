/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 
 * <pre>
 * org.dimigo.io
 *    |_SaveImageFromUrl
 * 
 * 1. 개요 :
 * 2. 작성일 : 2015. 10. 22.
 * </pre>
 *
 * @author		: 김현우
 * @version		: 1.0
 */
public class SaveImageFromUrl {

	public static void main(String[] args) {
		
		String imageUrl = "http://cfile22.uf.tistory.com/image/207D72514E22EA6E23949D";
		try {
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
			int result;
			// 파일에 write하기
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
			System.out.println("파일 생성 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
