package OneDimentionalArray;

public class SDA {
	int[] a;

//creation
	public SDA(int size) {
		a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.MIN_VALUE;
		}

		System.out.println("Array is createrd");
	}

	public void insert(int i, int v) {
		try {
			if (a[i] == Integer.MIN_VALUE) {
				a[i] = v;
				System.out.println("Value Inserted" + " " + a[i]);
			} else {
				System.out.println("Value Not Inserted");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid");
		}

	}

	void traversal() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	void searchbyvalue(int v) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == Integer.MIN_VALUE) {
				a[i] = v;
				System.out.println("value found");
				return;
			} else {
				System.out.println("Not found");
			}

		}
	}

	void searchbyindex(int ind) {
		try {
			if (a[ind] != Integer.MIN_VALUE) {
				System.out.println("Value found");
			} else {
				System.out.println("Not Found");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("HAndled");
		}
	}

	void deletebyvalue(int v) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == v) {
				a[i] = Integer.MIN_VALUE;
				System.out.println("value Deleted" + v);
				return;
			}
		}
	}

	void deletebyindex(int in) {
		try {
			if (a[in] != Integer.MIN_VALUE) {
				a[in] = Integer.MIN_VALUE;
				System.out.println("deleted" + " " + in);

			} else {
				System.out.println("ele not found");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("invalid");
		}
	}

	void delete() {
		a = null;
		System.out.println("Array deleted");
	}

	public static void main(String[] args) {
		SDA s = new SDA(5);

		s.insert(0, 10);
		s.insert(1, 20);
		s.insert(2, 30);
		s.insert(3, 40);
		s.insert(4, 50);

		s.traversal();
		s.searchbyvalue(10);
		s.searchbyindex(2);
		s.deletebyvalue(10);
		s.deletebyindex(2);
		s.delete();

	}
}
