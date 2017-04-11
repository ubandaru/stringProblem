package stringtest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyTest {
	
	@DataProvider
	public Object[][] provideData(){
		return new Object[][]{{'r', "array", "aay"}, {'r', "rubber", "ubbe"}, {'s', "governor", "governor"}, {'d', "sweet", "sweet"}};
	}
	
	@Test(dataProvider="provideData")
	public void validateFirstMethod(char inputChar, String inputString, String expectedString) {
		
		StringProblem stringProblem = new StringProblem();
		
		String outputString = stringProblem.firstMethod(inputString, inputChar);
		Assert.assertEquals(outputString.trim(),expectedString.trim());
		
		
	}
	@Test(dataProvider="provideData")
	public void validateSecondMethod(char inputChar, String inputString, String expectedString) {
		
		StringProblem stringProblem = new StringProblem();
		
		String outputString = stringProblem.secondMethod(inputString, inputChar);
		Assert.assertEquals(outputString.trim(),expectedString.trim());
		
		
	}

}
