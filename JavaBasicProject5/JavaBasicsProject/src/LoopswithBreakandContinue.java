
public class LoopswithBreakandContinue {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i+" testing");
		}
		System.out.println("End of the for loop. Proceeding with next steps");
		
		for(int j=1;j<=10;j++) {
			if(j==2) {
				continue;
			}
			System.out.println(j+" Edureka");
		}

	}

}
