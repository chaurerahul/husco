package com;

public class StringHalfReverse {

	 public static void main(String[] args) {
	// input
	// String str = "abcdpqrs";
	// output :---> "abcdsrqp"
	// output :---> "dcbapqrs"

	
		 String str = "Java";
			String  count = reverseString(count);
			System.out.println(count);
		 
	}
	 
	 public String reverseString(String s) {

			char[] array = s.toCharArray();
			int mid = array.length / 2;
			int sLength = array.length - 1;
			char temp;
			/* traverse until mid instead of whole length or using two pointers */
			for (int i = 0; i < mid; i++) {
				temp = array[i];
				array[i] = array[sLength - i];
				array[sLength - i] = temp;
			}
			return String.valueOf(array);
}
}
	
	
