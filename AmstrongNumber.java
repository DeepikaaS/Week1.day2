package Week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=111;
		int temp;
		temp=input;
		int result=0;

		while(temp!=0)
		{
			int rem=temp%10;
			result=result+(rem*rem*rem);
			temp=temp/10;
		}
		if (result==input)
		{
			System.out.println("The given number "+input+ " is Amstrong number");
		}
		else {
			System.out.println("The given number "+input+ " is not Amstrong number");
		}

	}

}
