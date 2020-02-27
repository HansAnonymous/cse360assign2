package cse360assign2;

public class SimpleList {
	private int[] list;
	private int count;

	public SimpleList() {
		this.list = new int[10];
		this.count = 0;
	}

	public void add(int n) {
		if(count == this.list.length-1) {
			this.count = this.list.length-1;
		} else {
			this.count++;
		}
		this.list[this.count] = n;
	}

	public void remove(int n) {
		int loc = search(n);
		if(loc > -1) {
			for(int i = loc; i < this.list.length-1; i++) {
				this.list[i] = this.list[i+1];
			}
			this.count--;
		}
	}

	public int count() {
		return this.count;
	}

	public String toString() {
		String res = "";
		for(int i = 0; i < this.count; i++) {
			res+=this.list[i];
			if(i < this.count-1) {
				res+=" ";
			}
		}
	}

	public int search(int n) {
		for(int i = 0; i < this.count; i++) {
			if(this.list[i] == n) {
				return i;
			}
		}
	}
}