package com;

public class Test1 {
	
	
	private static int checkDuplicateWord(String str) {
	    int count = 0;	
		String [] s = str.split(" ");
		for(int i = 0; i<s.length;i++) {
			for(int j=i+1; j<s.length;j++) {
			if(s[i].equals(s[j])) {
				count++;
			}
		   }
		}
		return  count;
	}
	public static void main(String[] args) {
		
		String str = "Java is a language Java is coding";
		int count = checkDuplicateWord(str);
		System.out.println(count);
	}

}
