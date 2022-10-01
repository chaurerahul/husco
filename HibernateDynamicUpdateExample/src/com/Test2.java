package com;

public class Test2 {
	
	private static int checkDuplicateCharacter(String str) {
		int count = 0;
       char[] cArray = str.toCharArray();
		char check =  cArray[0];
		for(int i = 0; i<cArray.length;i++) {
			
			if(check == cArray[i]) {
				count++;
		   }
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		String str = "abcdaaberesa";
		int count = checkDuplicateCharacter(str);
		System.out.println("Count of a : " + count);
	}

}
