package Week1.day2;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2,3,2,2};
		int[] fr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int no = arr[i];
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (no == arr[j]) {
					count++;
					fr[j] = -1;
				}
			}
			if (fr[i] != -1) {
				fr[i] = count;
				System.out.println("The frequency of " + arr[i] + " is " + fr[i] + " times.");
			}
		}

	}
}
