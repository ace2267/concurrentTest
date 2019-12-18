package threadTest.thread1;

public class threadTest1 extends Thread{

	@Override
	public void run() {
	
		for(int i =0 ; i < 10000 ; i++) {
			
			System.out.println(this.getName()+":: ㅎㅎㅎㅎㅎㅎㅎ");
		}
		
	}
}
