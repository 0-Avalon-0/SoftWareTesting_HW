import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testBubbleSort() {
		int origin1[] = {2,1,3,5,4};
		int fin1[] = {1,2,3,4,5};
		int origin2[] = {3,4,5,8,7,1};
		int fin2[] = {1,3,4,5,7,8};
		assertEquals(Arrays.toString(BubbleSort.BubbleSort(origin1)),Arrays.toString(fin1));
		assertEquals(Arrays.toString(BubbleSort.BubbleSort(origin2)),Arrays.toString(fin2));
	}

}
