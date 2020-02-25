/** 
 * @author		Travis Qing
 * @ClassID		244
 * @Assignment 	1
 * @Description This class creates a SimpleList that includes
 * 				an empty array of size 10 and a count integer
 * 				of value 0. The class is then able to add a number to the 
 * 				beginning of the list, remove a number from the list, return
 * 				the number of elements in the list, search for a specific element
 * 				in the list, and return a string of all the elements in the list.
**/
package cse360assign1;

public class SimpleList {
	private int[] list;
	private int count;
	
	/*	Creates a SimpleList object with an array of size 10 and a counter of value 0
		which will keep track of the number of elements in the array.*/
	public SimpleList() {
		list = new int[10];
		count = 0;
	}
	
	/*	Adds a number to the beginning of the list array of a SimpleList object. 
	 * If the array is already full, the function knocks off the last element 
	 * of the array and adds the new element in the parameter at the beginning of the array.
	 * The parameter is a number to add to the list*/
	public void add(int num) {
		if(count < 10) {
			count++;
		}
		
		//For the duration of the array it shifts all of the array elements
		//up a slot. 
		//If the count is 10 it overwrites the last element in the array.
		for(int var = count - 1; var > 0; var--) {
			list[var] = list[var - 1];
		}
		list[0] = num;
	}
	
	/*	Removes the first instance of the integer in the parameter.
	 *  The parameter is a number to be removed from the list.*/
	public void remove(int num) {
		int index = 0;
		while(list[index] != num) {
			index++;
		}
		
		//Replaces the elements with the ones located after the
		//element in the parameter, which in turn removes
		//the element at the location.
		for(int var = index + 1; var < index; var++) {
			list[var - 1] = list[var];
		}
		list[count - 1] = 0;
		count--;
	}
	
	/*Returns the count which represents the number of elements 
	 *available in the list array.
	 *Returns a value representing the number of elements in the list*/
	public int count() {
		return count;
	}
	
	/*Prints the elements in the SimpleList array in a string,
	 *with spaces separating each element.
	 *Returns a string that shows the elements in the list.*/
	public String toString() {
		if(count == 0) {
			return "";
		}
		else{
			//Returns the first element of the array.
			String result = Integer.toString(list[0]);
			
			//Returns every subsequent element with a space to separate them.
			for(int var = 1; var < count; var++) {
				result += " " + Integer.toString(list[var]);
			}
			return result;
		}
	}
	
	/*Returns an integer that represents the location of the number
	 *in the parameter.*/
	public int search(int num) {
		int index = 0;
		while(list[index] != num) {
			index++;
		}
		
		if(index > count) {
			return -1;
		}
		else {
			return index;
		}
	}
}
