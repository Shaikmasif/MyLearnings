
public class Memory implements Comparable<Memory>{
	int size;
	char name;
	@Override
	public int compareTo(Memory o) {
		// TODO Auto-generated method stub
		if(this.size < o.size) {
			return 1;
		}else if(this.size>o.size) {
			return -1;
		}else {
		return 0;
		}
	}

}
