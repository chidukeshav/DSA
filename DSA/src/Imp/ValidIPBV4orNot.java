package Imp;

public class ValidIPBV4orNot {
	static boolean isvalid(String ip) {
		String[] parts = ip.split("\\.");
		if (parts.length != 4) {
			return false;
		}
		for (String part : parts) {
			if (part.length() == 0 || part.length() > 3) {
				return false;
			}
			if (part.length() > 1 && part.charAt(0) == '0') {
				return false;
			}
			for (int i = 0; i < part.length(); i++) {
				if (!Character.isDigit(part.charAt(i))) {
					return false;
				}
			}
			int num = Integer.parseInt(part);
			if (num < 0 || num > 255) {
				return false;

			}
		}
		return true;

	}

	public static void main(String[] args) {
		{
			System.out.println(isvalid("192.0.45.78"));
		}
	}
}
