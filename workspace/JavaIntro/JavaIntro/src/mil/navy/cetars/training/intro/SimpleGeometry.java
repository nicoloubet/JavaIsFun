package mil.navy.cetars.training.intro;

	public class SimpleGeometry {
		static double pi = 3.14;

		SimpleGeometry(){
 
			System.out.println("Default Constructor");
		}
		SimpleGeometry(String s){
 
			System.out.println(s);

		}

		public void PerimeterOfSquare(double s) {
 
			System.out.println(s*4);
 
		}
		public void PerimeterOfTriangle(int s) {
 
			printHelp("The perimeter of a triangle is "+ s*3);
 
 
		}
		public double AreaOfCircle(double diameter) {
			double R = diameter/2;
			return pi*(R*R);
 

 
		}
		public void VolumeOfCylinder (double r, int h) {
			printHelp("the volume is = " + AreaOfCircle(r)*h);
 
		}
		protected void printHelp(String prnt) {
			System.out.println(prnt);
 
 
		}

		public static void main(String[] args) {
 
			SimpleGeometry firstInstance = new SimpleGeometry();
			SimpleGeometry secondInstance = new SimpleGeometry("i am the second instance");
			SimpleGeometry thirdInstance = new SimpleGeometry("i am the third instance");
			thirdInstance.PerimeterOfSquare(2.2);
			thirdInstance.PerimeterOfTriangle(4);
			System.out.println("The area = " + thirdInstance.AreaOfCircle(4.4));
			SimpleMath simMath =  new SimpleMath();
			simMath.myAddition(3,3);

 



   }
}


