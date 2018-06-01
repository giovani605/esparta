import java.util.ArrayList;

public class Test_1 {

	private ArrayList<Integer> list = new ArrayList<>();

	public Test_1() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = { 9, 3, 9, 3, 9, 7, 9 };
		Test_1 test = new Test_1();
		test.solution(vetor);
	}

	public int solution(int[] A) {
		for (int number : A) {
			insert(number);
		}
		if (list.isEmpty()) {
			System.out.println("The Array is invalid.");
			return 0;
		}
		return list.get(0);
	}

	private void insert(int a) {
		Integer integer = new Integer(a);
		if (list.contains(integer)) {
			// is pair, so remove the element
			list.remove(integer);
		} else {
			list.add(integer);
		}
	}

}
