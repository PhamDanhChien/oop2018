package week3;

import week3.Week3;
import org.junit.Test;
import org.junit.Assert.*;

public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()

	@Test	
	void testMax() {
		assertEquals(4, week3.max(2, 4));
		assertEquals(3, week3.max(3, -19));
		assertEquals(10, week3.max(0, 10));
		assertEquals(5, week3.max(5, 5));
		assertEquals(1999, week3.max(1999, 11));
	}
    // TODO: Viết 5 testcase cho phương thức minOfArray()
	
	@Test
	void testArray() {
		int mang1[] = {5, 6, 7, 8, 9};
		int mang2[] = {7, 3, 5, 8, 5, 8, 10};
		int mang3[] = {2};
		int mang4[] = {156, -1, 12};
		int mang5[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		
		
		assertEquals(5, week3.minOfArray(  mang1  ) );
		assertEquals(3, week3.minOfArray(  mang2  ) );
		assertEquals(2, week3.minOfArray(  mang3  ) );
		assertEquals(-1, week3.minOfArray(  mang4  ) );
		assertEquals(1, week3.minOfArray(  mang5  ) );
		
	}
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
	
	@Test
	void testBmi() {
		assertEquals(null, week3.calculateBMI(-10, 1.67));
		assertEquals("Thiếu cân", week3.calculateBMI(45, 1.7));
		assertEquals("Bình thường", week3.calculateBMI(55, 1.67));
		assertEquals("Thừa cân", week3.calculateBMI(60, 1.60));
		assertEquals("Béo phì", week3.calculateBMI(75, 1.55));
		
	}
}
