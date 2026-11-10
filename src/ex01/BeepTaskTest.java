package ex01;

import java.awt.Toolkit;

public class BeepTaskTest {

	public static void main(String[] args) throws InterruptedException {
		// 첫번째 작업 : 탕을 5번 출력
		for (int i = 0; i <5; i++) {
			System.out.println("탕");
			Thread.sleep(500);
		}
		// 두번째 작업 : 삡 소리를 5번 출력
		// 자바 확장 라이브러리를 이용하여 삡 소리 출력
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		for (int i = 0; i <5; i++) {
			toolkit.beep();
			Thread.sleep(500);
		}
	}

}
