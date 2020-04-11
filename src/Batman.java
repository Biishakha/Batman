import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Batman implements JL {
Queue<Integer> meteoroid = new LinkedList<>();
	
	@Override
	public void addNum(int num) {
		meteoroid.add(num);
		
	}

	@Override
	public void disMeteor() {
		if (meteoroid.size() >= 1) {
			meteoroid.poll();
		}
		else {
			throw new NoSuchElementException();
		}
	}

	@Override
	public int sizeMeteor() {
		return meteoroid.size();
	}
	
	@Override
	public void remove() {
		meteoroid.remove();
		
	}

}



