package examples.program;

public class StringExamples {

	public static void main(String[] args) {
		String name1="Bharath";
		String name2=new String("Bharath");
		String name3="Bharath";
		String name4=new String("Bharath");
		String name5="Bharath";
		name5="Cat";
		name5="Dog";
		String name6="Cat";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		if(name1==name2) {
			System.out.println("Name1 and Name2 are equal");
		}
		else {
			System.out.println("Name1 and Name2 are not equal");
		}
		
		if(name1==name3) {
			System.out.println("Name1 and Name3 are equal");
		}
		else {
			System.out.println("Name1 and Name3 are not equal");
		}
		
		
		if(name1.equals(name2)) {
			System.out.println("Name1 and Name2 are equal");
		}

	}

}
