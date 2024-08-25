
public class ClassExample {

	public static void main(String[] args) {
//		String dog1Name;
//		String dog1Color;
//		String dog1Breed;
		
		//ClassName referenceVariable/ObjectName=new ClassName();
		Dog dog1=new Dog();
		dog1.name="Tommy";
		dog1.breed="Bulldog";
		dog1.color="Brown";
		
		System.out.println(dog1.breed);
		System.out.println(dog1.color);
		System.out.println(dog1.name);
		dog1.barking();
		dog1.waggingTail();
		
		Dog dog2=new Dog("Xyz","Black and Brown","German Shepherd");
		System.out.println(dog2.breed);
		System.out.println(dog2.color);
		System.out.println(dog2.name);
		dog2.barking();
		dog2.waggingTail();
		dog1.waggingTail();
		
		
		Dog dog3=new Dog("Xyz","Black and Brown","German Shepherd");
	}

}

//Blueprint
class Dog{
	//State  -> Fields/Variables
	String name;
	String color;
	String breed;
	
	//Constructor
	public Dog() {
		System.out.println("Constructor called");
	}
	
	//Constructor
	public Dog(String name,String color,String breed) {
		System.out.println("Paramertized Constructor called");
		this.name=name;
		this.color=color;
		this.breed=breed;
	}
	
	//Behaviour -> Methods/Functions
	public void barking() {
		System.out.println("Barking");
	}
	
	public void waggingTail() {
		System.out.println("Wagging tail");
	}
}
