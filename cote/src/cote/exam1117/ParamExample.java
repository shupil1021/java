package cote.exam1117;

public class ParamExample {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		String str = new String("Hello");
		
		test(a);
		System.out.println("main" + a[2]);
		func();

	}
	public static void test(int[] arr) {
		arr[2] = 10;
	}
	
	public static void func() {
		
	}
}
