package com.service;

public class NoOfVowels {
    public int CountingVowels(String s){
    	 int countOfVowels=0;
  	   int index;
  	   for( index=0;index<s.length();index++){
  		   if(s.charAt(index)=='e'){
  			   countOfVowels++;
  		   }
  	   }
  	   return  countOfVowels;
    }
}
