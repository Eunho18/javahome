
public class Truck extends Cars {

	String name = "全快府";
	Truck(){}
	
	Truck(String name){
		super(name);
		System.out.println("Truck扁夯积己磊");
		System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		Truck bonggo = new Truck("豪绊");
		System.out.println("郴波:" + bonggo.name);
			
	}

}
