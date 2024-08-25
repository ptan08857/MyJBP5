package examples.program;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,345,565,676};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		
		int b[]=new int[5];
		b[0]=45;
		b[1]=83;
		b[2]=45;
		b[3]=83;
		b[4]=83;
//		b[5]=789;
		System.out.println(a.length);
		System.out.println(b.length);
		
		String names[]= {"Bharath","Edurkea","Testing","Selenium"};
		
		System.out.println(names[3]);
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		String[] emp=new String[12];
		System.out.println("*******************************");
		String[][] empData= {{"Bharath","Trainer"},{"John","Head of the department"},{"XYZ","Admin"}};
		
		System.out.println(empData[0][0]);
		System.out.println(empData[0][1]);
		empData[0][1]="Architect";
		System.out.println(empData[0][1]);
		for(int i=0;i<empData.length;i++) {
			System.out.println("Employee Name:="+empData[i][0]);
			System.out.println("Employee Designation:="+empData[i][1]);
		}
		String[][] empData1=new String[2][3];
		empData1[0][0]="Name1";
		empData1[0][1]="Designation1";
		empData1[0][2]="Deparement1";
		
		empData1[1][0]="Name2";
		empData1[1][1]="Designation2";
		empData1[1][2]="Deparement2";
		
		for(int i=0;i<empData1.length;i++) {
			System.out.println("Employee Name:="+empData1[i][0]);
			System.out.println("Employee Designation:="+empData1[i][1]);
			System.out.println("Employee Deparement:="+empData1[i][2]);
		}
		
		
	}

}
