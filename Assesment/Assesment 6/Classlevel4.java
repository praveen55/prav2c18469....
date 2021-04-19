public class Classlevel4 implements Runnable {
	@Override
	public void run()
	{
		classLock();
		}
	public void classLock()
	{
		System.out.println(Thread.currentThread().getName());
		synchronized(Classlevel4.class)
		{
			System.out.println("Synchronized block " + Thread.currentThread().getName());
			System.out.println("Synchronized block " + Thread.currentThread().getName() + " end");
			}
		}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Classlevel4 test1 = new Classlevel4();
		Thread t1 = new Thread(test1);
		Thread t2 = new Thread(test1);
		Classlevel4 test2 = new Classlevel4();
		Thread t3 = new Thread(test2);
		Thread t4 = new Thread(test2);
		Classlevel4 test3 = new Classlevel4();
		Thread t5 = new Thread(test3);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		t5.setName("t5");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		}
	}