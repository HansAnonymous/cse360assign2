/**
 * Author: Hans Husurianto
 * Class ID: 156
 * Assignment Number: 2
 * Description: This is the SimpleList class which defines the object "SimpleList"
 * and its methods: add(int n), remove(int n), count(), toString(), search(),
 *					append(int n), first(), and size().
 */

package cse360assign2;

public class SimpleList {
	private int[] list;
	private int count;

	/**
     * Constructor for the SimpleList object. Initializes its list to
     * 10 items and a count for the number of items in the list.
     */
	public SimpleList() {
		this.list = new int[10]; //initialize size of list
		this.count = 0;
	}
	
	/**
     * Adds a number to the beginning of the list in the
     * SimpleList object
     * If the list is already full, then increase the size
     * the list by 50%
     *
     * @param number    the number to be added to the list
     */
	public void add(int number) {
		int newSize = this.size();
		if(this.count == this.size()) {
			newSize = this.size() + this.size() / 2; 
		}
		int[] tempList = new int[newSize];
		
		tempList[0] = number;
		System.arraycopy(this.list, 0, tempList, 1, this.count);
		this.count++;
		this.list = tempList;
	}
	
	/**
	 * Append a number to the end of the list in SimpleList
	 * If the list is already full, then increase the size
	 * of the list by 50%
	 * 
	 * @param number	the number to be added to the end of the lsit
	 */
	public void append(int number) {
		int newSize = this.size();
		if(this.count == this.size()) {
			newSize = this.size() + this.size() / 2;
		}
		int[] tempList = new int[newSize];

		System.arraycopy(this.list, 0, tempList, 0, this.count());
		this.list = tempList;
		this.list[this.count] = number;
		this.count++;
	}
	
	/**
     * Removes a number from the SimpleList object if it exists.
     * If it does not exist, then nothing happens.
     * This uses the search(number) method to get the location of the
     * number if it exists.
     * If the list is more than 25% empty, then decrease
     * the size of the list by one.
     *
     * @param number    the number to be removed from the list
     */
	public void remove(int number) {
		int index = search(number);
        if(index > -1) {
        	this.count--;
            for(int iterator = index; iterator < this.list.length - 1;
                iterator++) {
                this.list[iterator] = this.list[iterator + 1];
            }
            float emptySpace = (float) this.list.length - (float) this.count;
    		if ( (emptySpace / (float) this.list.length) > 0.25 ) {
    			int[] tempList = this.list;
    			this.list = new int[this.list.length-1];
    			System.arraycopy(tempList, 0, this.list, 0, this.count);
    		}
        }
	}
	
	/**
     * Function that returns the number of elements in the SimpleList.
     *
     * @return  the integer that is the number of elements in SimpleList
     */
	public int count() {
		return this.count;
	}
	
	/**
	 * Function that returns the current number of possible locations
	 * in the list
	 * 
	 * @return	an integer that is the current number of possible locations
	 * 			in the list
	 */
	public int size() {
		return this.list.length;
	}
	
	/**
     * Function that converts the SimpleList items into a string
     *
     * @return  a string of the elements in the list
     */
	
	public String toString() {
		String result = "";
        for(int iterator = 0; iterator < this.count; iterator++) {
            result += this.list[iterator];
            if(iterator < this.count - 1) {
                result += " ";
            }
        }
        return result;
    }
	
	/**
	 * function that returns the first element in the list
	 * 
	 * @return	an integer which is the first element of the list
	 */
	public int first() {
		return this.list[0];
	}
	

	/**
     * function that looks through the list in SimpleList for the
     * parameter input {number}
     *
     * @param number    the number to search for in the list
     * @return          the location of {number} in the list
     */
    public int search(int number) {
        for(int iterator = 0; iterator < this.count; iterator++) {
            if(this.list[iterator] == number) {
                return iterator;
            }
        }
        return -1;
    }
}