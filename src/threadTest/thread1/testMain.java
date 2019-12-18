package threadTest.thread1;

public class testMain {

	public static void main(String[] args) {
		
		
		try {
			threadTest1 t1 = new threadTest1() ;
			threadTest1 t2 = new threadTest1() ;
			
			t1.start();
			t2.start();
			
			t1.sleep(100);
			t2.sleep(100);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	}

}
