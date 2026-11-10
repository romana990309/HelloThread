package ex01;

public class PauseHello {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("안녕하세용");
		// 잠시동안 (500m/s) 쉬어감 (sleep)
		Thread.sleep(10000);					// 500밀리초 1000밀리초가 1초
		String a = "반가워용"; 			     
		System.out.println(a);

	}

}
