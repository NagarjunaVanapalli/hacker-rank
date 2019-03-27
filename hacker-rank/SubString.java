

import java.util.TreeSet;

public class SubString {

	public static void main(String args[]) {
		String mx = "gbacaadc";
		String maxString = maxString(mx);
		System.out.println(maxString);
	}

	static String maxString(String mx) {
		TreeSet<String> ts = new TreeSet<>();
		for (int i = 0; i < mx.length() - 1; i++) {
			String substring = Character.toString(mx.charAt(i));
			ts.add(substring);
			for (int j = i + 1; j < mx.length(); j++) {
				substring = substring + Character.toString(mx.charAt(j));
				ts.add(substring);
			}
		}
		return ts.last();
	}

}
