/** 
 * @author		Travis Qing
 * @ClassID		244
 * @Assignment 	2
 * @Description This tests each of the methods of the SimpleList class
 * 				with at least one cases for a successful test.
**/

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SimpleListTest{
	
	@Test
	//Tests to see if the SimpleList Object is empty when created.
	public void simpleListShouldNotBeEmpty() {
		SimpleList simple = new SimpleList();
		assertEquals ("", simple.toString());
	}
	
	@Test
	//Tests to see if the SimpleList Object's array is empty when created.
	public void simpleListArrayShouldBeEmptyWhenCreated() {
		SimpleList simple = new SimpleList();
		assertEquals ("", simple.toString());
	}
	
	@Test
	//Tests to see if the SimpleList Object's count is 0 when created.
	public void simpleListCountShouldBeZeroWhenCreated() {
		SimpleList simple = new SimpleList();
		assertEquals(0, simple.count());
	}

	@Test
	//Tests to see if the add function adds to the SimpleList
	public void addShouldAddToList() {
		SimpleList simple = new SimpleList();
		simple.add(15);
		assertEquals("15", simple.toString());
	}
	
	@Test
	//Tests to see if the add function increments the count value.
	public void addShouldChangeCountValue() {
		SimpleList simple = new SimpleList();
		simple.add(15);
		assertEquals(1, simple.count());
	}
	
	@Test
	//Tests to see if adding to a full list adds to the array
	public void addShouldChangeFullListSize() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(4);
		simple.add(5);
		simple.add(6);
		simple.add(7);
		simple.add(8);
		simple.add(9);
		simple.add(10);
		simple.add(11);
		assertEquals("11 10 9 8 7 6 5 4 3 2 1", simple.toString());
	}
	
	@Test
	//Tests to see if adding to a full list adds to the count
	public void addShouldAddCountForFullList() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(4);
		simple.add(5);
		simple.add(6);
		simple.add(7);
		simple.add(8);
		simple.add(9);
		simple.add(10);
		simple.add(11);
		assertEquals(11, simple.count());
	}
	
	@Test
	//Tests to see if removing from the list removes the element correctly
	public void removeShouldRemoveNumbersFromList() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(6);
		simple.remove(3);
		assertEquals("6 2 1", simple.toString());
	}
	
	@Test
	//Tests to see if remove function removes all instances of the element
	public void removeShouldNotRemoveInstancesOfThatNumber() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(4);
		simple.add(3);
		simple.remove(3);
		assertEquals("4 3 2 1", simple.toString());
	}
	
	@Test
	//Tests to see if remove function decrements the count correctly
	public void removeShouldDecrementCount() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		simple.add(3);
		simple.add(6);
		simple.remove(3);
		assertEquals(5, simple.count());
	}
	
	@Test
	//Tests to see if remove function decrements the size correctly
	public void removeShouldDecrementSize() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		simple.add(3);
		simple.add(6);
		simple.remove(3);
		assertEquals(7, simple.size());
	}
	
	@Test
	//Tests to see if count returns the correct value
	public void countShouldNotChangeAddingToFullList() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(4);
		simple.add(5);
		simple.add(6);
		simple.add(7);
		simple.add(8);
		simple.add(9);
		simple.add(10);
		simple.add(11);
		assertEquals(11, simple.count());
	}
	
	@Test
	//Tests to see if count returns the correct size of the list
	public void countShouldReturnSizeOfList() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		assertEquals(4, simple.count());
	}

	@Test
	//Tests to see if the toString function returns a correct string
	public void toStringShouldNumbersInList() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		assertEquals("3 3 2 1", simple.toString());
	}

	@Test
	//Tests to see if the string will return the correct elements
	public void stringShouldNotReturnElevenNumbers() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(4);
		simple.add(5);
		simple.add(6);
		simple.add(7);
		simple.add(8);
		simple.add(9);
		simple.add(10);
		simple.add(11);
		assertEquals("11 10 9 8 7 6 5 4 3 2 1", simple.toString());
	}
	
	@Test
	//Tests to see if searching returns the correct location
	public void searchShouldReturnFirstLocationOfNumber() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		assertEquals(2, simple.search(2));
	}
	
	@Test
	//Tests to see if first returns the correct first
	public void firstShouldReturnBeginningOfList() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		assertEquals(3, simple.first());
	}
	
	@Test
	//Tests to see if last returns the correct last element
	public void lastShouldReturnEndOfList() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		assertEquals(1, simple.last());
	}
	
	@Test
	//Tests to see if append puts the correct appended element into the list
	public void appendShouldAddToEndOfList() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		simple.append(4);
		assertEquals(4, simple.last());
	}
	
	@Test
	//Tests to see if searching returns the correct size
	public void removeShouldKeepListAtOne() {
		SimpleList simple = new SimpleList();
		simple.add(1);
		simple.remove(1);
		assertEquals(1, simple.size());
	}
	
	@Test
	//Tests to see if searching returns the first element's instance
	public void searchShouldReturnLastLocationOfNumber() {
		SimpleList simple = new SimpleList();
		simple.add(3);
		simple.add(1);
		simple.add(2);
		simple.add(3);
		simple.add(3);
		assertEquals(2, simple.search(2));
	}
}
