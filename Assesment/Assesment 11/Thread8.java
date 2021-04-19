
public class Thread8 extends Thread {
	public void disp() {
		System.out.println("Display Method");
	}
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread8 s = new Thread8();
		s.disp();
		s.start();
		s.isAlive();
		
		System.out.println("Thread is Running");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		{
			Thread8 t = new Thread8();
			t.setPriority(MIN_PRIORITY);
			System.out.println("Minimum Priority : "+t.getPriority());
			t.start();
		
			Thread8 t1 = new Thread8();
			t1.setPriority(NORM_PRIORITY);
			System.out.println("Normal Priority : "+t1.getPriority());
			t1.start();
			
			Thread8 t2 = new Thread8();
			t2.setPriority(MAX_PRIORITY);
			System.out.println("Maximum Priority : "+t2.getPriority());
			t2.start();
		}
	}
}
