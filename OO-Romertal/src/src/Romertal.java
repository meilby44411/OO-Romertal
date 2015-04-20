package src;

public class Romertal {
	char[] a1 = new char[100];

	public String calculate(String s1, String s2) {
		String temp = s1 + s2;
		a1 = temp.toCharArray();
		String nyString = "";

		int antal_I = 0;
		int antal_V = 0;
		int antal_X = 0;
		int antal_L = 0;
		int antal_C = 0;

		for (char c : a1) {
			if (c == 'I')
				antal_I++;
			else if (c == 'V')
				antal_V++;
			else if (c == 'X')
				antal_X++;
			else if (c == 'L')
				antal_L++;
		}

		while (antal_I >= 5) {
			antal_V++;
			antal_I -= 5;
		}

		while (antal_V >= 2) {
			antal_X++;
			antal_V -= 2;
		}

		while (antal_X >= 5) {
			antal_L++;
			antal_X -= 5;
		}

		while (antal_L >= 2) {
			antal_C++;
			antal_L -= 2;
		}
		
		for (int i = 0; i < antal_C; i++) {
			nyString += "C";
		}


		for (int i = 0; i < antal_L; i++) {
			nyString += "L";
		}

		for (int i = 0; i < antal_X; i++) {
			nyString += "X";

		}

		for (int i = 0; i < antal_V; i++) {
			nyString += "V";
		}

		for (int i = 0; i < antal_I; i++) {
			nyString += "I";
		}

		return nyString;
	}

}
