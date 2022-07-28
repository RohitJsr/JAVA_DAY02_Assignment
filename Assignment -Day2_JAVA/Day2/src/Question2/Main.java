package Question2;

public class Main {

	static void switchCity(String city) {
		switch(city) {
		case "Mumbai":
			System.out.println(" Financial city");
			break;
		case "kolkata":
			System.out.println("city of joy");
			break;
		case "Delhi":
			System.out.println("Capital of country");
			break;
		case "Banglore":
			System.out.println("Cyber city");
			break;
		default:
			System.out.println("May be other city");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switchCity("Mumbai");
		
		
	}

}
