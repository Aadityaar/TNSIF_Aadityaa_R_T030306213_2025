package exception.handling.demo;

public class TryCatchFinallyDemo {
	
	public void demo() {
		int a = 5/0;
		System.out.println(a);
	}
	public void show() {
		try {
			demo();
		}catch(Exception e){
			System.out.println("Exception -->" + e);
		}finally {
			System.out.println("Hello world");
		}
	}

	public static void main(String[] args) {
		TryCatchFinallyDemo obj = new TryCatchFinallyDemo();
		obj.show();

	}

}
