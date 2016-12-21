public class Stack {
	
	int data[];
	int back, size;

	public Stack(int size) {
		data = new int[size];
		back = 0;
		this.size = size;
	}

	public void push(int d) {
		if (back == size) {
			extend();
		}
		data[back] = d;
		back++;
	}

	public int pop() {
		if (back != 0) {
			back--;
			return data[back];
		}
		else {
			return -1;
		}
	}

	private void extend() {
		// we can first copy data to an other array, then re-make data array bigger and copy data to it back
		// this will need two loops.
		// its better to make a new list , bigger than data , copy data to it and set data equal to new list

		int temp[] = new int[size + 1];
		for(int i = 0 ;i < size;i++) {
			temp[i] = data[i];
		}
		size++;
		data = temp;
	}
}