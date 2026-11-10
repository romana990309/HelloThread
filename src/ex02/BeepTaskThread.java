package ex02;

import java.awt.Toolkit;
import java.util.Scanner;

// Runnable 인터페이스를 이용한
	// Thread class 만들기
 class ShowTask implements Runnable{
	@Override
	public void run() {
		for (var i = 0; i < 5; i++) {
			System.out.println("오늘도 화이팅");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("출력중단");
				return;
			}
		}
		
	}

}
 	// 삑소리를 내는 작업 내용
 class BeepTask implements Runnable{
	
		@Override
		public void run() {
			Toolkit toolkit =Toolkit.getDefaultToolkit();
			 Scanner in = new Scanner(System.in);
			 System.out.println("최소 수를 입력해 주세요");
			 int input = Integer.parseInt(in.nextLine());
			 System.out.println("최대 수를 입력해 주세요");
			 int output = Integer.parseInt(in.nextLine());
			for ( int i=input; i <= output; i++) {
				System.out.println("삑" +"X"+i);
				toolkit.beep();
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("오류발생");
					return;
				}
			}
		}
	 
 }
 
 // 메인클래스 BeepTaskThread 
 public class BeepTaskThread {
	 public static void main(String[] args) {
		// 인터페이스인 Runnable 런 만 가지고있어서 메소드 run 만 호출가능
		 // 마찬가지로 start 도 안가지고 있어서 Thread 에서 가져와서 써야함
		 ShowTask task1 = new ShowTask();
		 Thread thread1 = new Thread(task1);
		 thread1.start();
		 BeepTask task2 = new BeepTask();
		 Thread thread2 = new Thread(task2);
		 thread2.start();
	}
 }
 