interface Interface1 {
	// By default the variable is final public static
	int balance = 6000;
	
	// Methods in interface are public and abstract by default
	void start();
	void stop();
	
	public static void main(String[] args) {
	
		Painting p1 = new Painting();
		p1.start();
		p1.stop();
		System.out.println(p1.balance);
		p1.draw();
	}
}

interface Drawing{
	void draw();
}

class Painting implements Interface1,Drawing{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting up");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping");
	}

	@Override
	public void draw() {
		System.out.println("This is drawing");
		// TODO Auto-generated method stub
		
	}
	
	
}