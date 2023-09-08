package com.javaExSet5;

public class FindLongestWordInAString {

	public static void main(String[] args) {
		FindLongestWordInAString longestWord = new FindLongestWordInAString();
		String result =longestWord.findLongestWord(" A quick brown fox jumps over the lazy dog ");
		System.out.println(" The result is : "+ result);
	}

	    public String findLongestWord(String sentence) {

	        // TODO: Write your code here
	        if(sentence.isEmpty())
	        return "";
	        String[] words = sentence.split(" ");
	        String longestWord = "";
	        int maxLength =0;
	        for(String word : words){
	            
	        if(word.length()> maxLength){
	            longestWord = word;
	            maxLength= word.length();
	        }
	            
	        }return longestWord;
	        
	    }
	}

