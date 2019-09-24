package mil.navy.cetars.training.intro;

public class SimpleMath {
SimpleGeometry simGeo = new SimpleGeometry();


public int myAddition(int sum, int sum1) {
 //int answer; 
 //Answer = sum + sum1;
 simGeo.printHelp("The sum of 3&3 is " + (sum + sum1));
 return -1; //Answer;
 
}

public int mySubtraction(int dif, int dif1) {
 int answer;
 answer = dif - dif1;
 return answer;

}
public int myDivision(int div, int div1) {
 int answer;
 answer = div / div1;
 return answer;
}

public int myMultiplication(int multi, int multi1) {
 int answer;
 answer = multi * multi1;
 return answer;
}


}

