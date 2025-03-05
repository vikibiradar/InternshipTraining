package junit;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
public class classerror {

public static void main(String[] args) {
	
	Result res=JUnitCore.runClasses(findmaxtest.class,CalculatorTest.class);
	for(Failure fail:res.getFailures())
	{
		System.out.println("The class is fauilure :"+fail.toString());
	}
	System.out.println("The class is successful :"+res.wasSuccessful());
}
	

}
