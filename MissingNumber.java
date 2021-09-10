package Week1.day2;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr= {1,2,3,5,8,6,10};
int size=arr.length-1;
Arrays.sort(arr);
//Printing array values as String after sorting
System.out.println("The array values"+ Arrays.toString(arr));
//finding only first missing number
/*
 * for(int i =1;i<size;i++) { if(i==arr[i]-1) { continue; } else { int b=i+1;
 * System.out.println(b); break; } }
 */
//finding all missing number 
for(int i=0;i<size;i++)
{
	if(arr[i]+1!=arr[i+1])
	{
		System.out.println(arr[i]+1);
	}
	}
}
	}
	


