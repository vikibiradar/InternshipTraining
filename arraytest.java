package junit;
import static org.junit.Assert.*;
import org.junit.Test;

public class arraytest {

@Test
public void testmyProg()
{
String st1=new String("abc");
String st2=new String("abc");
String st3=null;
String st4="abc";
String st5="abc";
int val1=5;
int val2=6;
String[] expectedArray= {"one","two","three"};
String[] resultArray= {"one","two","three"};
assertEquals(st1,st2); //this is used to check 2 objects.
assertTrue(val1 < val2); //this is used to check 2 values. It will also check true or false
assertFalse(val1 > val2); //this is used to check 2 values. It will also check true or false
assertNotNull(st1); //check if the object is not null 
assertNull(st3); //check if the object is null 
assertSame(st4,st5); //check if the object references point to the same object.
assertNotSame(st1,st3); //check if the object references not point to the same object.
assertArrayEquals(expectedArray,resultArray);//check whether 2 arrays are equal to each other
}

}
