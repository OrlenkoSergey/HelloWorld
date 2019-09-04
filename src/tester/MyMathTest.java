package tester;

import com.company.MyMath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {
    @Test
    public void testSomeMethod() {
        assertEquals(MyMath.doubleMe(1), 2);
        assertEquals(MyMath.doubleMe(10), 20);
    }

}
