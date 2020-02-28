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
		
		assertEquals(simplelist.search(1), 0);
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
		
		assertEquals(simplelist.count(), 10);
	}
	
	@Test
	void testAppend() {
		SimpleList simplelist = new SimpleList();
		simplelist.append(1);
		simplelist.append(2);
		simplelist.append(3);
		
		assertEquals(simplelist.search(3), 2);
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
		
		assertEquals(simplelist.count(), 11);
	}

	@Test
	void testRemove() {
		SimpleList simplelist = new SimpleList();
	}

	@Test
	void testCount() {
		fail("Not yet implemented");
	}

	@Test
	void testSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testFirst() {
		fail("Not yet implemented");
	}

	@Test
	void testSearch() {
		fail("Not yet implemented");
	}

}
