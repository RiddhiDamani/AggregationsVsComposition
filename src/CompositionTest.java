
public class CompositionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("Honda");
		Engine engine = car.getEngine();
		System.out.println(engine.getType());
		
		// Let's destroy car object
		car = null;
		// now, you can't get engine object
//		car.getEngine(); // Will lead to NullPointerException
	}

}
