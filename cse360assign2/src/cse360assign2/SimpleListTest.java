package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleListTest {

	@Test
	void testSimpleList() {
		SimpleList simplelist = new SimpleList();
		assertNotNull(simplelist);
	}
	
	@Test
	void testAdd() {
		SimpleList simplelist = new SimpleList();
		simplelist.add(3);
		simplelist.add(2);
		simplelist.add(1);
		
		assertEquals(0, simplelist.search(1));
	}

	@Test
	void testAddOverflow() {
		SimpleList simplelist = new SimpleList();
		//simplelist.add(11);
		simplelist.add(10);
		simplelist.add(9);
		simplelist.add(8);
		simplelist.add(7);
		simplelist.add(6);
		simplelist.add(5);
		simplelist.add(4);
		simplelist.add(3);
		simplelist.add(2);
		simplelist.add(1);		
		
		assertEquals(10, simplelist.count());
	}
	
	@Test
	void testAppend() {
		SimpleList simplelist = new SimpleList();
		simplelist.append(1);
		simplelist.append(2);
		simplelist.append(3);
		
		assertEquals(2, simplelist.search(3));
	}

	@Test
	void testAppendOverflow() {
		SimpleList simplelist = new SimpleList();
		simplelist.append(1);
		simplelist.append(2);
		simplelist.append(3);
		simplelist.append(4);
		simplelist.append(5);
		simplelist.append(6);
		simplelist.append(7);
		simplelist.append(8);
		simplelist.append(9);
		simplelist.append(10);
		simplelist.append(11);
		
		assertEquals(11, simplelist.count());
	}

	@Test
	void testRemoveCount() {
		SimpleList simplelist = new SimpleList();
		simplelist.append(1);
		simplelist.append(2);
		simplelist.append(3);
		simplelist.remove(2);
		
		assertEquals(2, simplelist.count());
	}
	
	@Test
	void testRemoveShifted() {
		SimpleList simplelist = new SimpleList();
		simplelist.append(1);
		simplelist.append(2);
		simplelist.append(3);
		simplelist.remove(2);
		
		assertEquals(1, simplelist.search(3));
	}

	@Test
	void testCount() {
		SimpleList simplelist = new SimpleList();
		simplelist.add(2);
		simplelist.append(3);
		simplelist.add(1);
		simplelist.remove(3);
		
		assertEquals(2, simplelist.count());
	}

	@Test
	void testSize() {
		SimpleList simplelist = new SimpleList();
		simplelist.add(2);
		simplelist.add(1);
		simplelist.append(3);
		simplelist.append(3);
		simplelist.append(4);
		simplelist.remove(3);
		
		assertEquals(9, simplelist.size());
	}

	@Test
	void testToString() {
		SimpleList simplelist = new SimpleList();
		simplelist.add(1);
		simplelist.append(2);
		simplelist.append(3);
		simplelist.append(4);
		simplelist.append(5);
		simplelist.append(6);
		
		assertEquals("1 2 3 4 5 6", simplelist.toString());
	}

	@Test
	void testFirst() {
		SimpleList simplelist = new SimpleList();
		simplelist.add(1);
		simplelist.append(2);
		simplelist.append(3);
		
		assertEquals(1, simplelist.first());
	}

	@Test
	void testSearch() {
		SimpleList simplelist = new SimpleList();
		simplelist.add(1);
		simplelist.append(2);
		simplelist.append(3);
		simplelist.append(4);
		simplelist.append(5);
		simplelist.append(6);
		
		assertEquals(3, simplelist.search(4));
	}

}
