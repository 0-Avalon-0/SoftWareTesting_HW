package Demo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class TestDemo {

    @Test
    public void test(){
        assertEquals(true,Solution.check(29));
        assertEquals(true,Solution.check(0));
        assertEquals(true,Solution.check(84));
        assertEquals(true,Solution.check(11));
    }
}
