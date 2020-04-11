import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JLtest {
Batman list;
	@BeforeEach
	void setUp() {
		list= new Batman();
	}

	@Test
	void testadd() {
		list.addNum(1);
		list.addNum(2);
		list.addNum(3);
		list.addNum(4);
		list.addNum(5);
		list.addNum(6);
		
		assertEquals(6, list.sizeMeteor());
	}
	@Test
	
	public void testdisMeteor() {
		list.addNum(1);
		list.addNum(2);
		list.addNum(3);
		list.addNum(4);
		list.addNum(5);
		list.addNum(6);
		
		assertEquals(6, list.sizeMeteor());
		list.disMeteor();
		assertEquals(5, list.sizeMeteor());
		list.disMeteor();
		assertEquals(4, list.sizeMeteor());
		list.disMeteor();
		assertEquals(3, list.sizeMeteor());
		
		
	}
	
	public void testRemove() {
		list.addNum(1);
		list.addNum(2);
		list.addNum(3);
		list.addNum(4);
		list.addNum(5);
		list.addNum(6);
		
		assertEquals(6, list.sizeMeteor());
		list.remove();
		assertEquals(5, list.sizeMeteor());
		list.remove();
		assertEquals(4, list.sizeMeteor());
		list.remove();
		assertEquals(3, list.sizeMeteor());
		list.remove();
		assertEquals(2, list.sizeMeteor());
		list.remove();
		assertEquals(1, list.sizeMeteor());
	}
	
	

}
