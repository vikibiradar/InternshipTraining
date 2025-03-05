package junit;
import static org.junit.Assert.*; 
import org.junit.Test;
public class CalculatorTest {
	Calculator cal=new Calculator();
	@Test  //used to identify that a method is a test method
	public void testSquare()
	{
	assertEquals(25,cal.square(5));
	assertEquals(36,cal.square(6));
	}
	@Test
	public void testUser()
	{
		assertEquals("Shubham",cal.user("Shubham"));
	}
	@Test
	public void stringTest1()
	{
		String result=cal.concat("Hello", "EveryOne");
		assertEquals("HelloEveryOne",result);
		String s1="Hello";
		String s2="Hello";
		assertSame(s1,s2);
		String s3="helloworld";
		String s4="HELLOWORLD";
		assertTrue(s3.equalsIgnoreCase(s4));
		assertTrue(s3.toLowerCase().equals(s4.toLowerCase()));
		assertTrue(s3.toUpperCase().equals(s4.toUpperCase()));
		assertTrue(s3.length() == s4.length());
	}

}
