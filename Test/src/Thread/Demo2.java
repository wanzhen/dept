package Thread;

public class Demo2 extends Thread {
    
	@Override
	public void run() {
		 for(int i = 0 ; i <10 ;i++){
			 try {
				 Thread.sleep(10);
				 //System.out.println("线程睡眠了");
				 System.out.println("线程睡眠了"+Thread.currentThread().getName()+" "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		 }
	}

	public static void main(String[] args) {
		new Demo2().start();
		//Demo2 b = new Demo2();
		Demo2 a = new Demo2();
		//b.start( );
		a.start();
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
