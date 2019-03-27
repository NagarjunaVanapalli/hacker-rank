

import java.util.TreeMap;

public class DistinctPairs {

	public static void main(String args[]) {
		int[] a = new int[] { 1, 2, 3, 6, 7, 8, 9, 1 };
		int k = 10;
		System.out.println(distinctPair(a, k));

	}

	static int distinctPair(int[] a, int k) {

		TreeMap<Integer, Integer> tm = new TreeMap<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == k) {
					if (tm.get(a[j]) == null) {
						tm.put(a[i], a[j]);
					} else if (tm.get(a[j]) != a[i]) {
						tm.put(a[i], a[j]);
					} else {

					}

				}

			}
		}
		return tm.size();
	}
}
