
public class Runnable9 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable9 r = new Runnable9();
		Thread t = new Thread(r);
		t.start();	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running.....");
	}
}
