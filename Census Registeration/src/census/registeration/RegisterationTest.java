package census.registeration;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegisterationTest {
    
	String actualName = Registeration.Register("Desalegn Getachew");
	String expectedName = "Desalegn Getachew";
	
	@Test
	public void test() {
		
		
			System.out.println("Actual Name: " + actualName + "\nExpected Name: "
					+expectedName);
			assertEquals(actualName, expectedName);
			
	}
}