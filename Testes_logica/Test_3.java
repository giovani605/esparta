import java.util.ArrayList;

public class Test_3 {

	private ArrayList<Integer> list = new ArrayList<>();

	public static void main(String[] args) {
		Test_3 tet = new Test_3();
		tet.solution(10, 4);
	}

	public int solution(int N, int M) {
		int cont = 0;
		int c = 0;
		boolean flag = true;
		while (flag) {
			if (test(c)) {
				cont++;
				c = passo(c, N, M);
			} else {
				flag = false;
			}

		}
		return cont;
	}

	private int passo(int c, int N, int M) {
		c = c + M;
		if (c >= N)
			return c - N;
		return c;

	}

	private boolean test(int a) {
		Integer integer = new Integer(a);
		if (list.contains(integer)) {
			// is pair, so remove the element
			return false;
		} else {
			list.add(integer);
			return true;
		}
	}

}
