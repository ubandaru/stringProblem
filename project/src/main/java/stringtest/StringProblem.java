package stringtest;

public class StringProblem {
	
	public String firstMethod(String inputString, char inputChar) {
		
		String returnString = "";
		char [] chars = {};
		char [] newChars = new char[100];
		int i = 0;
		
		
		/*
		 * Iterate through all the characters of original string. Add all of them to the new Character array
		 * except the input character
		 */
		
		chars = inputString.toCharArray();
		for (char c:chars) {
			if (c!=inputChar) {
				newChars[i] = c;
				i++;
			}
		}
		returnString = new String(newChars);
		
		return returnString;
	}
	
	public String secondMethod(String inputString, char inputChar) {
		
		String returnString = "";
		String cString = "" + inputChar;
		
		returnString = inputString.replace(cString, "");
		
		return returnString;
	}

}
