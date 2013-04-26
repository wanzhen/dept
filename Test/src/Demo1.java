import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Demo1 {

	/**
	 * @param args
	 */
	static int a = 0;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		System.out.println("1234");
//        int a = 0;
//		say();

		Scanner console = new Scanner(System.in);
	    
		String str = null;
	    try {
	    	  str = new String(console.nextLine().getBytes("GB2312"),"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    System.out.println(str);
	    
		
	 
	 
	    
	 
		

	}


	public static void say() {
		System.out.println("1234");
	    a = 10;
	    System.out.println(a);
	    for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}
