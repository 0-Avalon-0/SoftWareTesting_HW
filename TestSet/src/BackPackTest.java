import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class BackPackTest {

	@Test
	public void test() {
		int m1 = 10;
        int n1 = 3;
		int w1[] = {3, 4, 5};
        int p1[] = {4, 5, 6};
        int c1[][] = {{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},{0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}};
        
        for(int i=1;i<=3;i++) {
        	assertEquals(Arrays.toString(BackPack.BackPack_Solution(m1, n1, w1, p1)[i]),Arrays.toString(c1[i]));
        }
        
        
	}

}
