import java.util.Iterator;

class Mythread extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("child class"+i);
		}
	}
public class Sleep3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread s= new Mythread();
		s.start();
		for(int i =0;i<5;i++) {
			Thread.yield();
			System.out.println("Main Thread"+i);
			try {
				s.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
