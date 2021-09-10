package Week1.day2;

import javax.sound.sampled.ReverbType;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String input = "MOM";
		 
	        // getBytes() method to convert string
	        // into bytes[].
	        byte[] strAsByteArray = input.getBytes();
	       // System.out.println(//strAsByteArray);
	 
	        byte[] result = new byte[strAsByteArray.length];
	 
	        // Store result in reverse order into the
	        // result byte[]
	        for (int i = 0; i < strAsByteArray.length; i++)
	            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
	 
	        System.out.println(new String(result));

	}

	
}
