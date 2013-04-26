package Thread;

import java.util.Timer;
import java.util.TimerTask;

import javax.management.timer.TimerMBean;

public class TestTime extends TimerTask  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Timer time = new Timer();
             time.schedule(new TestTime(), 1000,10);
             time.cancel();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	  System.out.println(Thread.currentThread().getName());	
	}

}
