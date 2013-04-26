package Thread;

public class Demo3 implements Runnable {
	 private Foo foo = new Foo();
	public static void main(String[] args) {
		  
		   Demo3 t = new Demo3();
		   Thread t1 = new Thread(t);
		   Thread t2 = new Thread(t);	  
			t1.start();
			t2.start();
          
	}

	@Override
	 public void run() {
		 for(int i = 0;i<3 ;i++){
			 foo.setX(3);
//			 try {
//				 Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			 //this.fix(30);
			 System.out.println(Thread.currentThread().getName()+"  "+foo.getX());
		 }
		
	}
	private  int fix(int x){
		 return foo.setX(x);
		
	}

}
class Foo{
	int x = 100;
	public int getX() {
		return x;
	}
	public int setX(int y) {
		synchronized (this) {
			this.x =   x - y;
			System.out.println(x);
		}
		
		return x;
	}
}

