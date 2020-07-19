
public class Car {
	
	//final will sure engine is initialized within constructor
	private final Engine engine;
	
	public Car(String engineType) {
		
		// Instantiating Engine class here and setting its type value
		// Here, its says like Engine is composed within Car
		//So, as long as Car objects stays, engine object stays
		engine = new Engine();
		engine.setType(engineType);
	}
	
	public Engine getEngine() {
		return engine;
	}
}
