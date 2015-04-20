package src;

public class Romertal {
	char[] a1 = new char[100];
	
	public String calculate(String s1, String s2){
		String temp = s1 + s2;
		a1 = temp.toCharArray();
		String nyString = "";
		
		int antal_I = 0;
		int antal_V = 0;
		
		for(char c : a1){
			if(c == 'I')
				antal_I++;
		}
		
		while (antal_I >=5){
			antal_V++;
			antal_I -=5;
		}
			
		for	(int i = 0; i < antal_V; i++) {
			nyString += "V";
		}
		
		
		for	(int i = 0; i < antal_I; i++) {
			nyString += "I"; 
		}
		
		
		
		return nyString;
	}

}
