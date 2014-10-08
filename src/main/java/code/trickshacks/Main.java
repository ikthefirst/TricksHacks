package code.trickshacks;

public class Main {

	public static void main(String[] args) {
		// Long value = new Long(0);
		// System.out.println(value.equals(0));

		System.out.println(returnSomething());
	}

	public static int returnSomething() {
		try {
			throw new RuntimeException("foo!");
		} finally {
			return 0;
		}
	}

	public int aMethod() {
		http: // www.google.com
		return 1;
	}

	public int ftp() {
		ftp: // google.com/file.txt
		return 0;
	}

	public int doSomething() {
		http: for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break http;
			}
		}
		return 0;
	}
}
