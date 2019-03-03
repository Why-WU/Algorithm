
public class ArrayList {
	private int capacity;
	private int size;
	private int[] data;

	public ArrayList(int capacity_) {
		this.capacity = capacity_;
		this.size = 0;
		this.data = new int[capacity];
	}

	public void add(int value) {
		if (size < this.data.length) {
			this.data[size] = value;
		} else { // À©ÈÝ
			int[] tempArr = this.data;
			this.capacity *= 2;
			this.data = new int[this.capacity];
			for (int i = 0; i < this.size; i++) {
				this.data[i] = tempArr[i];
			}
			this.data[this.size] = value;
		}
		this.size++;
	}
}
