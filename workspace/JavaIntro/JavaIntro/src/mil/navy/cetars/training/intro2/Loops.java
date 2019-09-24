package mil.navy.cetars.training.intro2;

public abstract class Loops {
	public abstract void forLoop(String[] myArray); 
	public abstract void enhancedLoop(String[] myArray);
	public abstract void whileLoop(String[] myArray, String arr);
	public abstract void doWhileLoop(String[] Array, String arr);
	public abstract void iterator(String[] Array);
	
	
	
	public void run(String[] array) {
		this.forLoop(array);
		this.enhancedLoop(array);
		this.whileLoop(array, "ball");
		this.doWhileLoop(array, "flag");
		this.iterator(array);
		
	}
	
}
