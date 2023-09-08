package com.javaExSet5;

public class TwoConsecutiveIdenticalCharsInAString {

	

	    /**
	     * This method checks if a given string has two consecutive identical characters.
	     *
	     * @param str The string to check for consecutive duplicates.
	     * @return true if the string has consecutive duplicates, false otherwise.
	     */
	
	public static void main(String[] args) {
		TwoConsecutiveIdenticalCharsInAString str = new TwoConsecutiveIdenticalCharsInAString();
		boolean result = str.hasConsecutiveDuplicates("Anusha");
		System.out.println(" The given string has consecutive identical strings : " + result);
	}
	    public boolean hasConsecutiveDuplicates(String str) {
	        
	        if(str.isEmpty() || str.length()==1)
	        return false;
	        
	         // Jyothi ---5 but after coming to 5th index there is no next value to compare
	        for (int i=0;i<str.length()-1;i++){  //as we do str.length there is no other char after the end of the string so we need to go with str.length -1;
	         char currentChar = str.charAt(i);
	         char nextChar = str.charAt(i+1);
	         if(currentChar == nextChar)
	        return true;
	        }
	        return false;
	        // TODO: Write your code here
	    }
	    
         public boolean hasDuplicates(String str) {
	        
	        if(str.isEmpty() || str.length()==1)
	        return false;
	        int count=0;
	         
	        for (int i=0;i<str.length()-1;i++){
	         char charCount = str.charAt(i);
	         count ++;
	         if(charCount >1)
	        return true;
	        }
	        return false;
	        // TODO: Write your code here
	    }
	}

