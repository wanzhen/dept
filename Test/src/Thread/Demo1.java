package Thread;
public class Demo1 extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if (i % 10 == 0) {
				System.out.println(i + "abcdef");
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	public static void main(String[] args) {
  		new Demo1().start();
		System.out.println("123");
	}
 
}
