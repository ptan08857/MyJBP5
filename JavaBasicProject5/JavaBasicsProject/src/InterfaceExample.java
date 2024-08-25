
public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBrowser obj=new Firefox();
		Firefox obj1=new Firefox();
		MyCustomBrowser obj2=new Opera();
		MyBrowser obj3=new Opera();
	}

}

interface MyBrowser{
	public void openUrl();
	public void refresh();
	public void bookMark();
	
}

abstract class MyCustomBrowser implements MyBrowser{
	public void openUrl() {
		System.out.println("Open the URL");
	}
	//He does not know how to implement refresh and bookmark functionality
}

class Opera extends MyCustomBrowser{

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookMark() {
		// TODO Auto-generated method stub
		
	}
	
}

class Firefox implements MyBrowser{
	public void openUrl() {

	}
	public void refresh() {

	}
	public void bookMark() {

	}
}

class Chrome implements MyBrowser{
	public void openUrl() {

	}
	public void refresh() {

	}
	public void addPlugIns() {

	}

	public void bookMark() {
		// TODO Auto-generated method stub

	}
}

class Edge implements MyBrowser{
	public void openUrl() {

	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bookMark() {
		// TODO Auto-generated method stub

	}
}

class Safari implements MyBrowser{

	@Override
	public void openUrl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bookMark() {
		// TODO Auto-generated method stub
		
	}
	
}