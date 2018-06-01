import java.util.ArrayList;

public class Test_2 {

	private ArrayList<Integer> list = new ArrayList<>();

	public Test_2() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = { 9, 3, 9, 3, 9, 7, 9 };
		Test_2 test = new Test_2();
		test.solution(vetor);
	}

	public int solution(int[] A) {
		for (int number : A) {
			insert(number);
		}
		return list.size();
	}

	private void insert(int a) {
		Integer integer = new Integer(a);
		if (!list.contains(integer)) {
			// is pair, so remove the element
			list.add(integer);
		}
	}
}
