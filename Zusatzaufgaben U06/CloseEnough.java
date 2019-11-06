import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CloseEnough {
    
	static boolean closeEnough(int[] a, int[] b, int eps) {
        for(int i = 0; i < a.length; i++)
            if(Math.abs(a[i] - b[i]) > eps)
                return false;
        
        return true;
    }
 
    
    @Test
    public void testCloseEnough() {
        assertTrue(closeEnough(new int[]{0, 1, 2}, new int[]{0, 1, 2}, 0));
        assertTrue(closeEnough(new int[]{0, 1, 2}, new int[]{0, 1, 3}, 1));
        assertFalse(closeEnough(new int[]{0, 1, 2}, new int[]{0, 1, 3}, 0));
        
        
        // Was ist mit?
        assertFalse(closeEnough(new int[]{0, 1, 2}, new int[]{0, 1}, 0));
    }
    
}
