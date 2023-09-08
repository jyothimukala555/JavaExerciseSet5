package com.javaExSet5;

public class RightMostDigitInAString {



    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
	
	public static void main(String[] args) {
		RightMostDigitInAString digit = new RightMostDigitInAString();
		int result1 = digit.getRightmostDigit("I Have bought 10 pencils and 5 pens from the store");
		System.out.println("The right most digit in the given sentence is : " + result1);
		int result2 =digit.getLeftmostDigit("I Have bought 8 pencils and 5 pens from the store");
		System.out.println("The left most digit in the given sentence is : " + result2);
	}
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
         if(str.isEmpty()){
            return -1;
            }
            int length =str.length();
        for (int i=length-1;i>=0;i--){
            char ch =str.charAt(i);
            if(Character.isDigit(ch)){
                return Character.getNumericValue(ch);
            }
            
        }
        return -1;
    }
    public int getLeftmostDigit(String str) {

    if(str.isEmpty()){
        return -1;
        }
        int length =str.length();
    for (int i=0;i<=length-1;i++){
        char ch =str.charAt(i);
        if(Character.isDigit(ch)){
            return Character.getNumericValue(ch);
        }
        
    }
    return -1;
    }
}

