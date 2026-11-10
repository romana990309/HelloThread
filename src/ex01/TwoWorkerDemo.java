package ex01;

public class TwoWorkerDemo {

	public static void main(String[] args) {
		//첫번째 작업 흐름 객체 생성
		NumberWorker number = new NumberWorker();
		// 두번째 작업흐름 객체 생성
		TextWorker text = new TextWorker();
		// 객체가 생성될 때 자동실행되는건 생성자만 유일
		number.start();
		text.start();
	}

}
// 첫번째 NumberWorker
class NumberWorker extends Thread{
	public void run(){
		for (int i = 1; i < 6; i++) {
			System.out.println("숫자: " + i);
			try { Thread.sleep(500);
				
			} catch (InterruptedException e) {
				System.out.println("작업중단");
				return;
			}
		}
		
	}
	
}
// 두번째 TextWorker
class TextWorker extends Thread{
	public void run() {
		
	}
}