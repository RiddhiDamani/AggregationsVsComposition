
public class AggregationTest {

	public static void main(String[] args) {
		
		// In aggregation, both objects will have an independent existence i.e. employee and address
		//If employee object dies; then address object would not die
		Address address = new Address();
		address.setStreet("Park Street");
		address.setZipCode(1099209L);
		address.setAddressLine1("Address Line 1");
		address.setAddressLine1("Address Line 2");
		
		Employee employee = new Employee(1098765, "Seam Murphy", "sean.m@yahoo.com", address);
		System.out.println(employee);
		
		//Now, let's destroy Employee Object
		employee = null;
		
		System.out.println("After destroying employee object: ");
		System.out.println(employee);
		System.out.println(address);
	}

}
