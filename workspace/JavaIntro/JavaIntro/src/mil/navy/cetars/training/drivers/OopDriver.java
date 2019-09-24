package mil.navy.cetars.training.drivers;
import mil.navy.cetars.training.oop.StaticTest;
import mil.navy.cetars.training.oop.StaticTestTwo;

public class OopDriver {

	public static void main(String[] args) {
		System.out.println(StaticTest.returnValue()); //What does this return?
		System.out.println(StaticTestTwo.returnValue());//How about this one?
		StaticTest testTwo = new StaticTest();//What comes back?
		System.out.println(testTwo.returnValue());//Will this even work?		
	}

}
