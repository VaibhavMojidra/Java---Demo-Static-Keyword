
public class Demo {
	static String name;
	
	void setname(String n) {
		name=n;
	}
	public static void main(String[] args) {
		
		//Creating object in one line;
		Demo d1=new Demo();
		
		//Creating reference variable of Demo Class
		Demo d2;
		
		//Initializing d2 reference variable with a value hence converting it to a object.
		
		d2=new Demo();
		
		//Syntax of object is new keyword which will allocate the memory and create space for that object in memory follow by Class constructor Demo()
		
		
		d1.setname("Vaibhav");
		d2.setname("Riya");
		
		System.out.println("Object 1: D1 - name "+d1.name);
		System.out.println("Object 2: D2 - name "+d2.name);
		System.out.println("This demostrates that even though each object has its own copy of attributes and methods,\nif any attribute or method is static than there will one and one only copy of attribute or method accross all objects");
		System.out.println("The other way or can say actual/right way to access static members is <ClassName>.<Method/Attribute> Demo.name");
		System.out.println("Demo.name: "+Demo.name);
		
	}
}
