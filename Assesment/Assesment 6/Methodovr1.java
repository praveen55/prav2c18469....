class method{
	int add(int a,int b,int c) {
		return a+b+c;
	}
	int sub(int a,int b,int c) {
		return a-b-c;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a,int b) {
		return a/b;
	}
	void sum(int a, int b) {
		System.out.println(a+b);
	}
}

public class Methodovr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method val = new method();
		int a = val.add(5,5,5);
		int b = val.sub(10,10,5);
		int c = val.mul(5,10);
		int d = val.div(20, 5);

		System.out.println("Addition : " + a);
		System.out.println("Subtraction : " + b);
		System.out.println("Multiplication : " + c);
		System.out.println("Divide : " + d);
	}
}