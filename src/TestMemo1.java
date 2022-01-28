import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.MemoUtil;

/**  
* Kai Mwirotsi-Shaw - kimwirotsishaw  
* CIS171 12601 WH1  
* Jan 25, 2022  
*/
public class TestMemo1 {
	String memo = "Kai";
	MemoUtil memoUtil = new MemoUtil(memo);

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void test() {
		assertEquals(memo, memoUtil.printMemo());
	}
	
	@Test public void testMemoLength() {
		int memoLength = memo.length();
		assertTrue(memoLength == memoUtil.returnMemoLength());
	}
	
	@Test
	public void testMemoNotNull() {
	 assertNotNull(memoUtil.printMemo( ));
	}

}
