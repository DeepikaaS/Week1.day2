package Week1.day2;

public class IntersectionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 3, 2, 11, 4, 6, 7 };
		int length1 = a.length;
		int[] b = { 1, 2, 8, 4, 9, 7 };
		int length2 = b.length;

		for (int i = 0; i < length1; i++) {
			for (int j = 0; j < length2; j++) {
				if (a[i] != b[j]) {
					continue;
				} else {
					System.out.println("The intersection number is:" + a[i]);

				}

			}

		}
	}

}
