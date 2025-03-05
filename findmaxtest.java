package junit;
import org.junit.Test;
import static org.junit.Assert.*;


public class findmaxtest {
	@Test
	public void testmax() { 
		assertEquals(67,maxclass.findmax(new int[] {1,2,3,5,67,64,}));
		assertEquals(40,maxclass.findmax(new int[] {34,40,2,1,3,4,2,34}));
	}

}
