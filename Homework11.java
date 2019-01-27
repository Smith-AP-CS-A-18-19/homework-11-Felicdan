import java.util.ArrayList;

public class Homework11 {

	/* Finish the constructor and create any necessary instance
	 * variables. The constructor should create and save an
	 * ArrayList of int values
	 */
	 public static ArrayList<Integer> arr = new ArrayList<Integer>();

	public Homework11(ArrayList<Integer> list) {
		arr = list;
  }

	/* Return the stored ArrayList
	 */
	public ArrayList<Integer> getList(ArrayList<Integer> list) {
		return list;
	}

	/* Fill the stored array list with integers, starting
	 * at n and up to, but not including, m. The size of
	 * the resultant ArrayList should be n - m.
	 */
	public void problem1(int n, int m) {
		for(int i = n; i < m; i++){
			arr.add(i);
		}
	}

	/* Remove from the stored array list all numbers that
	 * are evenly divisible by n. Remember that when you
	 * remove an item from the ArrayList, all elements to
	 * the right shift their indices down one.
	 */
	public void problem2(int n) {
		for(int i = 0; i < arr.size(); i++){
			if(arr.get(i) % n == 0){
				arr.remove(i);
				i--;
			}
		}
	}


	/* Problem 3:
	 * Write the class Homework11A that extends this
	 * class. Ensure that you create the constructor
	 * appropriately and import java.util.ArrayList.
	 */

	public static void main(String[] args) {
		boolean passed = true;
		Homework11 hw11 = new Homework11();

		hw11.problem1(5, 13);
		ArrayList<Integer> al = hw11.getList();
		if (al.size() != 8) {
			System.out.println("Fail 1.1");
			passed = false;
		} else if (al.get(3) != 8) {
			System.out.println("Fail 1.2");
			passed = false;
		} else {
			System.out.println("Pass 1");
		}

		hw11.problem2(3);
		if (al.size() != 5) {
			System.out.println("Fail 2.1");
			passed = false;
		} else if (al.get(3) != 10) {
			System.out.println("Fail 2.2");
			passed = false;
		} else {
			System.out.println("Pass 2");
		}

		Homework11A hw11a = new Homework11A();

		hw11a.problem1(3, 13);
		al = hw11a.getList();
		if (al.size() != 10) {
			System.out.println("Fail 3.1");
			passed = false;
		} else if (al.get(4) != 7) {
			System.out.println("Fail 3.2");
			passed = false;
		} else {
			System.out.println("Pass 3");
		}

		if (hw11a.problem4() != 75) {
			System.out.println("Fail 4");
			passed = false;
		} else {
			System.out.println("Pass 4");
		}

		hw11a.problem2(12);
		if (al.size() != 4) {
			System.out.println("Fail 5.1");
			passed = false;
		} else if (al.get(3) != 12) {
			System.out.println("Fail 5.2");
			passed = false;
		} else {
			System.out.println("Pass 5");
		}

		if (passed) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

	}
}
