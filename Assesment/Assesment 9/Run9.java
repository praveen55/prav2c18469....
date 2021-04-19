public class Run9 extends Thread{
		public void run() {
			for(int i = 1;i<6;i++) {
				try {
					Thread.sleep(200);
				}catch(InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("Run Method" +i);
			}
		}
		public void show() {
			for(int i = 1;i<5;i++) {
				try {
					Thread.sleep(200);
				}catch(InterruptedException e) {
					System.out.println(e);
				}
				System.out.println("Show Method "+i);
			}
		}
		public static void main(String[] args) {
			Run9 r = new Run9();
			Run9 r1 = new Run9();
			r.run();
			r1.show();
		}
}