package Test;

import org.junit.Before;
import org.junit.Test;
import hw.Hw;

public class TestDemo {
	private Hw hw;
	
	@Before
	public void set() {
		hw = new Hw();
	}
	
	@Test
	public void test() {
		hw.printPrimes(10);
	}
	
}
