package SDET25;

import org.testng.annotations.Test;

public class CmdLineTest {
	@Test
	public void NewLineTest() {
		
		String url = System.getProperty("url");
		System.out.println(url);
		
	}

}
