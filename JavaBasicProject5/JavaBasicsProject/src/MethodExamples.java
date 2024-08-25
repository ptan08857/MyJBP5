
public class MethodExamples {
	
	public static void main(String args[]) {
		int total=sum(100,200);
		System.out.println(total);
		max(100,200);
		max(200,100);
		max(1000,1000);
		String finalValue=addStrings("Bharath", "Edureka");
		System.out.println(finalValue);
		int t1=sum(1,2,3);
		System.out.println(t1);
		String a=sum("Abc","xyz");
		System.out.println(a);
	}
	
	//Method overloading
	public static int sum(int x, int y) {
		return x+y;
	}
	
	//Method overloading
	public static int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	//Method overloading
	public static String sum(String a,String b) {
		return a+b;
	}
	
	public static String addStrings(String a, String b) {
		return a+b;
	}
	
	public static void max(int x, int y) {
		if(x>y) {
			System.out.println(x+ " is larger");
		}
		else if(x<y) {
			System.out.println(y+" is larger");
		}
		else {
			System.out.println(x+" "+y+" are equal");
		}
	}

}
