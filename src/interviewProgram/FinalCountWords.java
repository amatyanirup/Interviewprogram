package interviewProgram;

import java.util.HashMap;

public class FinalCountWords {
//Q#5 Write a Java Program to count the number of words in a string using HashMap
	public static void main(String[] args) {
		String str ="Mount Everest is is the Tallest mountain in the world .";
		String [] split= str.split(" ");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for (int i=0;i<split.length-1;i++) {
		 if(map.containsKey(split[i])){
			int count = map.get(split[i]);
			map.put(split[i], count+1);
			
		}
		 else {
			 map.put(split[i], 1);
		 }
		 
			
		}
		
		System.out.println(map);

	}

}
