package OneDimentionalArray;

public class sda_string {
	String[] s;

	public sda_string(int size) {
		s = new String[size];

	}

	// insertion
	void insert(int index, String value) {
		try {
			if (s[index] == null) {
				s[index] = value;
			}
			System.out.println("Value Inserted" + " " + index + " " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
	}
	//traversal
	void traversal() {
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
	}
	//Searchbyval
	void searchbyval(String val) {
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(val)) {
				System.out.println("value found");
				return;
			}
		}
		System.out.println("Value is not found");
		
		
	}
	//SearchbyIndex
	void searchbyIndex(int index) {
		if(s[index]!=null) {
			System.out.println(s[index]);
		}
	}
	//Delete by Index
	void Deletebyindex( int index) {
		if(s[index]!=null) {
			s[index]=null;
			System.out.println("value Deleted");
			return;
		}
	}
	//Deletebyvalue
	void Deletebyvalue(String val) {
		for(int i=0;i<s.length;i++) {
			if(s[i].equals(val)) {
				s[i]=null;
				System.out.println("deleted");
				return;
			}
		}
		System.out.println("Not inserted");
	}
	public void delete() {
		s=null;
		System.out.println("aaaa");
	}
	public static void main(String[] args) {
		sda_string sd = new sda_string(4);
		sd.insert(0, "josi");
		sd.insert(1, "chidu");
		sd.insert(2, "sharath");
		sd.insert(3, "marati");
		
		sd.traversal();
		sd.searchbyval("hbygy");
		//sd.searchbyIndex(2);
		//sd.traversal();
		//sd.Deletebyindex(2);
	}

}
