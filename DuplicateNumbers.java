package Week1.day2;

public class DuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 14, 12, 13, 11, 15, 14, 18, 16,17, 19, 18, 17, 20,13 };
		int length1 = a.length;

		for (int i = 0; i < length1; i++) {
			{
				for (int j = i + 1; j < length1; j++) {
					if (a[i] != a[j]) {
						continue;
					} else {
						System.out.println("The Duplicate number is:" + a[i]);

					}

				}
			}

		}

	}

}
