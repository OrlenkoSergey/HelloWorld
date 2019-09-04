package tester;

import com.company.MyMath;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyMathTrueFalseTest {
    @Test
    public void testFail(){
        assertFalse(MyMath.doubleMe(1)==3);
    }

    @Test
    public void testTrue(){
        assertTrue(MyMath.doubleMe(1)!=3);
    }

}
