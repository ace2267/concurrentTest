package threadTest.thread1;

public class testMain2 {

	public static void main(String[] args) {
		
		
		try {
			threadTest2 t1 = new threadTest2() ;
			threadTest2 t2 = new threadTest2() ;
			
			Thread tt1 = new Thread(t1) ;
			Thread tt2 = new Thread(t2) ;
			tt1.start();
			tt2.start();
			
			tt1.sleep(100);
			tt2.sleep(100);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	}

}
