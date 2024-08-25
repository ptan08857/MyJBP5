
public class SwitchStatement {

	public static void main(String[] args) {
		String day="Mon";
		
		switch(day) {
		case "Mon":
			System.out.println("It is Monday");
			break;
		case "Tue":
			System.out.println("It is Tuesday");
			break;
		case "Wed":
			System.out.println("It is Wedensday");
			break;
			
			default:
				System.out.println("Given value is not mathed to any of the switch cases");
		}
		
		char a='A';
		switch(a) {
		case 'A':
			System.out.println("A for apple");
			break;
		case 'B':
			System.out.println("B for Bat");
			break;
		}
		
		int b=10;
		switch(b) {
		case 10:
			System.out.println("Ten");
		}
		
		if(day=="Tue") {
			System.out.println("Tuesday");
		}
		else if(day=="Mon") {
			System.out.println("Monday");
		}
		else if(day=="Wed") {
			System.out.println("Wednesday");
		}

	}

}
