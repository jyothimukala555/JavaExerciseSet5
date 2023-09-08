package com.javaExSet5;

public class CountOfUpperAndLowerCaseInAString {
	
	    
	    /**
	     * This method counts the number of uppercase letters in a given string.
	     *
	     * @param str The string to count uppercase letters in.
	     * @return The number of uppercase letters in the string.
	     */
	public static void main(String [] args) {
		CountOfUpperAndLowerCaseInAString str = new CountOfUpperAndLowerCaseInAString();
		int resultUpper =str.countUppercaseLetters("JyotHi");
		System.out.println("The count of upper case letters in the given word is : " + resultUpper);
		int resultLower = str.countLowercaseLetters("JyotHi");
		System.out.println("The count of lower case letters in the given word is : " + resultLower);
	}
	    
	    public int countUppercaseLetters(String str) {
	        // TODO: Write your code here
	        if(str==null){
	            return -1;
	        }
	        int count =0;
	       
	        for(int i=0; i<str.length();i++){
	       
	       if( Character.isUpperCase(str.charAt(i))){
	              count++;
	        }
	               
	           }return count;
	    }
	    public int countLowercaseLetters(String str) {
	        // TODO: Write your code here
	        if(str==null){
	            return -1;
	        }
	        int count =0;
	       
	        for(int i=0; i<str.length();i++){
	       
	       if( Character.isLowerCase(str.charAt(i))){
	              count++;
	        }
	               
	           }return count;
	    }
	}

