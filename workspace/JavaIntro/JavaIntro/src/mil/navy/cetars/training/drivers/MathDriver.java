package mil.navy.cetars.training.drivers;

import mil.navy.cetars.training.intro.SimpleMath;

public class MathDriver {

	private void runMath() {
		 SimpleMath simMath =  new SimpleMath();
		 simMath.myAddition(3,3);
		 simMath.mySubtraction(4,3);
		 simMath.myDivision(2,10);
		 simMath.myMultiplication(5,5);
		
		}


		public static void main(String[] args) {
		 MathDriver mathDriver = new MathDriver();
		 mathDriver.runMath();

		}


}
