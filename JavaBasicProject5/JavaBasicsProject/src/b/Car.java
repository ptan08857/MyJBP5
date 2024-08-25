package b;

public class Car {
	
	public static void main(String args[]) {
		Car obj=new Car();
		
		obj.startCar();
		
	}
	
	private void fuelInjection() {
		System.out.println("Inject fuel");
	}
	
	private void rorateElectricMotor() {
		System.out.println("Rotate electric motor to start");
	}
	
	public void startCar() {
		fuelInjection();
		rorateElectricMotor();
	}

}
