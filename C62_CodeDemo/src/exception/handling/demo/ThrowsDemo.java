package exception.handling.demo;

public class ThrowsDemo {
	
	public void Demo() throws Exception {
		int a = 5/0;
		System.out.println(a);
	}
	public void Show() {
		try {
			Demo();
		}catch(Exception e){
			System.out.println("Exception -->" + e);
		}finally {
			System.out.println("Hello world");
		}
	}

	public static void main(String[] args) {
		ThrowsDemo obj = new ThrowsDemo();
		obj.Show();

	}

}
